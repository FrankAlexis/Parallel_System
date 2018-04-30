#include <stdio.h>
#include <time.h>
#include <sys/time.h>
#include <stdlib.h>

#define MAX 1000
#define ITERA 30
double average(double*);
double standarDeviation(double*, double);

int main(void){
  double tiemposCaso1[ITERA];
  double tiemposCaso2[ITERA];
  for(int index = 0; index < ITERA; index++){
    
    double A[MAX][MAX], x[MAX], y[MAX], elapsedTime, r;
    int i, j;

    struct timeval t1, t2;
    
    // initialization
    srand(time(NULL));

    for(i = 0; i < MAX; i++){
      for(j = 0; j < MAX; j++){
        r = rand();
        A[i][j] = r;
      }
      r = rand();
      x[i] = r;
      y[i] = 0;
    }  
    // Loops
    // First case
    gettimeofday(&t1, NULL);
    for(i = 0; i < MAX; i++){
      for(j = 0; j < MAX; j++){
        y[i] += A[i][j]*x[j];
      }
    }
    gettimeofday(&t2, NULL);
    elapsedTime = (t2.tv_sec - t1.tv_sec) * 1000.0;      // sec to ms
    elapsedTime += (t2.tv_usec - t1.tv_usec) / 1000.0;   // us to ms
    tiemposCaso1[index] = elapsedTime;
    printf("%0.3f ", elapsedTime);

    // Second case
    gettimeofday(&t1, NULL);
    for(j = 0; j < MAX; j++){
      for(i = 0; i < MAX; i++){
        y[i] += A[i][j]*x[j];
      }
    }

    gettimeofday(&t2, NULL);
    elapsedTime = (t2.tv_sec - t1.tv_sec) * 1000.0;      // sec to ms
    elapsedTime += (t2.tv_usec - t1.tv_usec) / 1000.0;   // us to ms
    tiemposCaso2[index] = elapsedTime;
    printf("%0.3f\n", elapsedTime);
  }

  double mediaCaso1 = average(tiemposCaso1);
  double mediaCaso2 = average(tiemposCaso2);
  printf("1:%f 2:%f\n", mediaCaso1, mediaCaso2);
  printf("1:%f 2:%f\n", standarDeviation(tiemposCaso1, mediaCaso1), standarDeviation(tiemposCaso2, mediaCaso2));
  return 0;
}

double average(double vector[]){
  double result = 0.0;
  for(int index = 0;index < ITERA; index++){
      result += vector[index];
  }
  return result/ITERA;
}

double standarDeviation(double vector[], double media){
  double result = 0.0;
  for(int index = 0;index < ITERA; index++){
      double temporal = (vector[index] - media);
      result += temporal*temporal;
  }
  result = result/ITERA;
  return result;
}