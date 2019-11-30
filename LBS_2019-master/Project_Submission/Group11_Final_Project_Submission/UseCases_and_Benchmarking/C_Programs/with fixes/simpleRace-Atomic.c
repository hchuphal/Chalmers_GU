#include<stdio.h>
#include<pthread.h>

_Atomic int shared_var=1;

static void * thread1(void * arg){
	shared_var++;
	return NULL;
}

static void * thread2(void * arg){
	shared_var++;
	return NULL;
}

int main(int argc,char ** argv) {

	pthread_t t1,t2;

pthread_create(&t1,NULL,thread1,NULL);
pthread_create(&t2,NULL,thread2,NULL);
pthread_join(t1,NULL);
pthread_join(t2,NULL);
printf("shared_var= %d\n",shared_var);
}











