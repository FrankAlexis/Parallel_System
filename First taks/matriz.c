#include <stdio.h>
#include <time.h>
#include <sys/time.h>
#include <stdlib.h>

#define MAX 1000
double average(double*);
double standarDeviation(double*, double);

int main(void){
    
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
    printf("%0.3f\n", elapsedTime);

  return 0;
}
