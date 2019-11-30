/* Copyright (c) 2016,2017,2018 Runtime Verification, Inc.
 * All rights reserved.
 */
#include <err.h>
#include <pthread.h>
#include <sched.h>
#include <stdbool.h>
#include <stdlib.h>

#include "nbcompat.h"
#define USEMUTEX

static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
 bool condition = false;
int sharedVar;

static void *
thread1(void *arg __unused)
{
	sharedVar = 1;
 #ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	condition = true;
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
	return NULL;
}

static void *
thread2(void *arg __unused)
{	
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	while (!condition) {
		sched_yield();
	}
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
	if (sharedVar != 1) {
		errx(EXIT_FAILURE, "How is this possible!?");
	}

	return NULL;
}

int
main(void)
{
	pthread_t t1, t2;

	pthread_create(&t1, NULL, thread1, NULL);
	pthread_create(&t2, NULL, thread2, NULL);

	pthread_join(t1, NULL);
	pthread_join(t2, NULL);
	return 0;
}
