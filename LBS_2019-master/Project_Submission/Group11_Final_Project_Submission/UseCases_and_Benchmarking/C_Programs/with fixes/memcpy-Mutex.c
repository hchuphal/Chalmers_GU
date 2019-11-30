/* Copyright (c) 2016,2017,2018 Runtime Verification, Inc.
 * All rights reserved.
 */
#include <pthread.h>
#include <stdio.h>
#include <string.h>	/* for memcpy */

#include "nbcompat.h"
#define USEMUTEX

static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
int x;

static void *
assignfn(void *arg __unused)
{
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	x = 5;
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
	return NULL;
}

static void *
copyfn(void *arg __unused)
{
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	int y = 10;

	memcpy(&x, &y, sizeof(x));
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
	return NULL;
}

int
main(int argc __unused, char *argv[] __unused)
{
	pthread_t assign, copy;

	pthread_create(&assign, NULL, assignfn, NULL);
	pthread_create(&copy, NULL, copyfn, NULL);
         
	pthread_join(assign, NULL);
	pthread_join(copy, NULL);

	printf("x = %d\n", x);
	return 0;
}   
