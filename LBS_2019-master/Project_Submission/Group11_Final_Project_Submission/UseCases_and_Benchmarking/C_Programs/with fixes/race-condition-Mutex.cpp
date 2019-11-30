#include <cstdlib>
#include <iostream>
#include <vector>
#include <stdexcept>
#include <unistd.h>
#include <pthread.h>

#define USEMUTEX

static pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
static int zob = 0;

void *threadMain(void *)
{
  sleep(1);

  for (int i = 0; i < 100; i++)
  {
#ifdef USEMUTEX
    pthread_mutex_lock(&mutex);
#endif
    zob++;
#ifdef USEMUTEX
    pthread_mutex_unlock(&mutex);
#endif
  }
   return 0;
}

static void doTest()
{
  const size_t NumThreads = 3;
  std::vector<pthread_t> threads;

  // Create threads
  for (size_t i = 0; i < NumThreads; ++i)
  {
    std::cout << "Creating thread #" << i << std::endl;
    pthread_t tid;
    if (pthread_create(&tid, 0, threadMain, 0) != 0)
      throw std::runtime_error("Failed to create thread");
    threads.push_back(tid);
   }

  // Small pause to keep the output easier to follow
  std::cout << "pausing..." << std::endl;
  sleep(3);
  std::cout << "...paused." << std::endl;

  // Wait for threads to stop before returning
  for (size_t i = 0; i < NumThreads; ++i)
  {
    // block until thread i completes
    std::cout << "Stopping thread #" << i << std::endl;
    if (pthread_join(threads[i], NULL) != 0)
      throw std::runtime_error("Failed to join thread");
  }
}

int main(int argc, char *argv[])
{
  try
  {
    doTest();
  }
  catch (std::exception& e)
  {
    std::cerr << "Exception: " << e.what() << std::endl;
    return EXIT_FAILURE;
  }

  pthread_mutex_destroy(&mutex);

  std::cout << "zob=" << zob << std::endl;

  return EXIT_SUCCESS;
}

