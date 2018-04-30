#include <stdio.h>
#include <time.h>
#include <stdlib.h>


int main(){
    float z[1000];
    for(int index = 0; index < 1000; index++){
        z[index] = index;
    }
    double suma = 0.0;
    for(int index = 0; index < 1000; index++){
        suma = suma + z[index];
    }
    printf("La suma del vector es: %0.2f\n", suma);
    return 0;
}