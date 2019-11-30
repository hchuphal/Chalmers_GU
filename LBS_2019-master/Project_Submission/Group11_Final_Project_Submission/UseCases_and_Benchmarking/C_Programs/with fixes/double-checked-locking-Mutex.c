/* Copyright (c) 2016,2017,2018 Runtime Verification, Inc.
 * All rights reserved.
 */

#include <pthread.h>
#include <stdatomic.h>
#include <stdio.h>
#include <stdlib.h>
#include "nbcompat.h"
#define USEMUTEX

static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

typedef struct _resource {
	void (*do_something)(void);
} resource_t;

static void
something(void)
{
	printf("something\n");
}

resource_t * volatile resource_ptr = NULL;
pthread_mutex_t resource_mutex = PTHREAD_MUTEX_INITIALIZER;

static void *
foo(void *arg __unused)
{
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
	if (resource_ptr == NULL) {
		pthread_mutex_lock(&resource_mutex);
		if (resource_ptr == NULL) {
			resource_t *r = malloc(sizeof(*r));
			r->do_something = something;
			resource_ptr = r;
		}
		(*resource_ptr->do_something)();
		pthread_mutex_unlock(&resource_mutex);
	}
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
	return NULL;
}

int
main(void)
{
	pthread_t t1, t2;
	pthread_create(&t1, NULL, foo, NULL);
	pthread_create(&t2, NULL, foo, NULL);

	pthread_join(t1, NULL);
	pthread_join(t2, NULL);
	if (resource_ptr != NULL)
		free(resource_ptr);
}

