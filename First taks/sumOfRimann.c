/*
* Name         : sumOfRimann.c
* Author       : Frank Castrillón
* Compilation  : gcc -Wall sumOfRimann.c -o sumOfRimann
* Execution    : ./sumOfRimann 10 10 20
* Objective    : Calculate area under curve of a function
*/

#include<stdio.h>
#include<stdlib.h>

double f(double x);
double trapecio(double a, double b, double n);

int main(int argc, char* argv[]){
    if (argc != 4){
        printf("ERROR: you need to provide exactly three arguments.\n For example: ./sumOfRimann 10 10 20");
        return -1;
    }
    double a,b,n;
    a = atoi(argv[2]);
    b = atoi(argv[3]);
    n = atoi(argv[1]);
    if (a > b){
       printf("ERROR: The number a must be less that number b.\n");
       return -1;
    }
    if (n == 0){
       printf("ERROR: The number of partitions must be different of zero.\n");
       return -1;
    }
    printf("El area bajo la curva es: %5.3f\n", trapecio(a, b, n));
    return 0;
}

double f(double x){
    return x*x*x;
}

double trapecio(double a, double b, double n){
    double h = (b - a)/n;
    //printf("Valor de a(%0.2f), b(%0.2f), n(%0.2f) y h:%0.2f\n", a, b, n, h);
    double suma = (f(a) + f(b))/2;
    for(int index = 1; index < n; index++){
        suma = suma + f( a + index*h);
    }
    suma = suma*h;
    return suma;
}