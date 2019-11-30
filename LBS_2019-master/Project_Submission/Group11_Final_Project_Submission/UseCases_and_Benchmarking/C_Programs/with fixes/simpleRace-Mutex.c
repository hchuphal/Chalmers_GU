#include<stdio.h>
#include<pthread.h>
#define USEMUTEX

int shared_var=1;
static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

static void * thread1(void * arg){
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	shared_var++;

#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif

return NULL;	
}

static void * thread2(void * arg){
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	shared_var++;
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
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











