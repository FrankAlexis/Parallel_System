#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>
/*
Proper Use of C's volatile Keyword
A variable should be declared volatile whenever its value could change unexpectedly. 
In practice, only three types of variables could change:
1. Memory-mapped peripheral registers
2. Global variables modified by an interrupt service routine
3. Global variables accessed by multiple tasks within a multi-threaded application
*/
volatile int counter = 0;
int loops;

void *worker(void *arg){
  int i;
  for (i = 0; i < loops; i++){
    counter++;
  }
  return NULL;
}    

int main (int argc, char* argv []){
  if (argc != 2){
    fprintf(stderr, "usage: threads <value>\n");
    exit(1);
  }
  loops = atoi(argv[1]);
  pthread_t p1, p2;
  printf("Initial value : %d \n", counter);

  pthread_create(&p1, NULL, worker, NULL);
  pthread_create(&p2, NULL, worker, NULL);
  pthread_join(p1, NULL);
  pthread_join(p2, NULL);
  printf("Final value : %d\n", counter);
  return 0;
}