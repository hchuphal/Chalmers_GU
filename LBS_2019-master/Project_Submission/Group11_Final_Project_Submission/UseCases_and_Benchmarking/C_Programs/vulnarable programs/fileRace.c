#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

FILE *fptr;

   int num1=1;
	int num2=2;

static void * thread1(void * arg){
fptr = (fopen("test", "a"));
   if(fptr == NULL)
   {
       printf("Error!");
       exit(1);
   }
	fprintf(fptr,"\n Num=%d \n",num1);
	return NULL;
}

static void * thread2(void * arg){
fptr = (fopen("test", "a"));
   if(fptr == NULL)
   {
       printf("Error!");
       exit(1);
   }
	fprintf(fptr,"\n Num=%d \n",num2);
	return NULL;
}

int main(int argc,char ** argv) {

	pthread_t t1,t2;

pthread_create(&t1,NULL,thread1,NULL);
pthread_create(&t2,NULL,thread2,NULL);
pthread_join(t1,NULL);
pthread_join(t2,NULL);
fclose(fopen("test", "w"));
}











