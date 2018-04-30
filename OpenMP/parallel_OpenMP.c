#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

double f(double x);
void trap_f (double, double , int, double *);

int main(int argc, char* argv[]){
  double a, b;
  int n, nt;

  if (argc != 5){
    printf("Error: ingrese solo 4 argumentos: a, b, n y numThreads \n");
    return 1;
  }

  double global_result = 0.0;
  a = atof(argv[1]);
  b = atof(argv[2]);
  n = atoi(argv[3]);
  nt = atoi(argv[4]);


  printf("Calcular el area aproximada bajo la curva f(x)= x^3 en el intervalo [%2.1f %2.1f], usando %d trapecios\n\n",a, b, n);
  
  
  double start_time = omp_get_wtime();
  
  #pragma omp parallel num_threads(nt) 
  trap_f(a, b, n, &global_result);

  double time = omp_get_wtime() - start_time;

  printf("El area es: %6.3f usando %5.3f seg\n", global_result, time);
  return 0;
}

void trap_f (double a, double b, int n, double* g_r){
  double h, approx, x_i;
  int i;

  int my_rank = omp_get_thread_num(); 
  int n_t = omp_get_num_threads();
  h = (b-a)/n;
  int local_n = n / n_t;
  double local_a = a + my_rank * local_n * h;
  double local_b = local_a + local_n * h;
    
  approx = (f(local_a)+f(local_b))/2;
  for (i = 1; i < local_n - 1; i++){
    x_i = local_a + i * h;
    approx += f(x_i); 
  }
  approx = h * approx;
  
  #pragma omp critical
  *g_r += approx;
}

double f(double x){
  return x*x*x;
}