#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

double f(double x);
double trap_f (double a, double b, int n);

int main(int argc, char* argv[]){
  double a, b, result;
  int n;

  if (argc != 4){
    printf("Error: ingrese solo 3 argumentos: a, b y n\n");
    return 1;
  }

  a = atof(argv[1]);
  b = atof(argv[2]);
  n = atoi(argv[3]);

  printf("Calcular el area aproximada bajo la curva f(x)= x^3 en el intervalo [%2.1f %2.1f], usando %d trapecios\n\n",a, b, n);
  
  double start_time = omp_get_wtime();
  result = trap_f(a, b, n);
  double time = omp_get_wtime() - start_time;

  printf("El area es: %6.3f usando %5.3f seg\n", result, time);
  return 0;
}

double trap_f (double a, double b, int n){
  double h, approx;
  int i;
  h = (b-a)/n;
  approx = (f(a)+f(b))/2;
  
  #pragma omp parallel for reduction(+: approx)
  for (i = 1; i < n-1; i++){    
    approx += f(a + i * h); //x_i = a + i * h;
  }
  
  approx = h * approx;
  return approx;
}

double f(double x){
  return x*x*x;
}