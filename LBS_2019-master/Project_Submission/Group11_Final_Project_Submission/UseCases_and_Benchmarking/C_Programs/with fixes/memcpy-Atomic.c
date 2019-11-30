/* Copyright (c) 2016,2017,2018 Runtime Verification, Inc.
 * All rights reserved.
 */
#include <pthread.h>
#include <stdio.h>
#include <string.h>	/* for memcpy */

#include "nbcompat.h"


_Atomic int x;

static void *
assignfn(void *arg __unused)
{
	x = 5;
	return NULL;
}

static void *
copyfn(void *arg __unused)
{
	_Atomic int y = 10;
	memcpy(&x, &y, sizeof(x));
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
