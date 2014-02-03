package com.livingoz.event.platform.core.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.livingoz.event.platform.api.AsynchronousExecutor;
import com.livingoz.event.platform.core.EventHandler;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultExecutorService implements AsynchronousExecutor {
  
  final Logger logger = Logger.getLogger(DefaultExecutorService.class.getName());
  
  private ThreadPoolExecutor executorService;

  @Override
  public void executeAsynchronously(Runnable runnable) {
    if (!isRunning()) {
      throw new RejectedExecutionException(getClass().getName() + " is not running!");
    }
    executorService.execute(runnable);
  }
  
  @Override
  public <V> Future<V> executeAsynchronously(Callable<V> callable) {
    if (!isRunning()) {
      throw new RejectedExecutionException(getClass().getName() + " is not running!");
    }
    return executorService.submit(callable);
  }

  @Override
  public <V> Future<V> handleEvent(EventHandler<V> handler) {
    return null;
  }

  public boolean isRunning() {
    if (executorService == null || executorService.isShutdown() || executorService.isTerminated()) {
      return false;
    }
    return true;
  }

  protected void initialize() {
    logger.info("AsynchronousExecutor[" + getClass().getName() + "] starting...");

    executorService = (ThreadPoolExecutor) ExecutorServiceFactory.createExecutorService();

    logger.info("AsynchronousExecutor[" + getClass().getName() + "] started.");
  }

  protected void cleanup() {
    try {
      logger.info("AsynchronousExecutor[" + getClass().getName() + "] shutting down...");
      executorService.shutdown();
      try {
        if (!executorService.awaitTermination(60L, TimeUnit.SECONDS)) {
          logger.log(Level.WARNING, getClass().getName() + " did not shutdown cleanly all running Jobs in 60 seconds.");
          executorService.shutdownNow();
          // TODO: handle returned jobs?
        }
      } catch (InterruptedException e) {
        logger.log(Level.WARNING, getClass().getName() + " did not shutdown cleanly.", e);
      }
      logger.info("AsynchronousExecutor[" + getClass().getName() + "] shut down.");
    } catch (Throwable t) {
      logger.log(Level.SEVERE, "An error occurred during shut down of " + getClass().getName(), t);
    } finally {
      executorService = null;
    }
  }
  
  @Override
  public void start() {
    if (!isRunning()) {
      initialize();
    }
  }

  @Override
  public void shutdown() {
    if (!isRunning()) {
      return;
    }
    cleanup();
  }

  @Override
  public List<Runnable> shutdownNow() {
    return executorService.shutdownNow();
  }

  @Override
  public boolean isShutdown() {
    return executorService.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return executorService.isTerminated();
  }

  @Override
  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
    return executorService.awaitTermination(timeout, unit);
  }

  @Override
  public <T> Future<T> submit(Callable<T> task) {
    return executorService.submit(task);
  }

  @Override
  public <T> Future<T> submit(Runnable task, T result) {
    return executorService.submit(task, result);
  }

  @Override
  public Future< ? > submit(Runnable task) {
    return executorService.submit(task);
  }

  @Override
  public <T> List<Future<T>> invokeAll(Collection< ? extends Callable<T>> tasks) throws InterruptedException {
    return executorService.invokeAll(tasks);
  }

  @Override
  public <T> List<Future<T>> invokeAll(Collection< ? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
    return executorService.invokeAll(tasks, timeout, unit);
  }

  @Override
  public <T> T invokeAny(Collection< ? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
    return executorService.invokeAny(tasks);
  }

  @Override
  public <T> T invokeAny(Collection< ? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException,
          TimeoutException {
    return executorService.invokeAny(tasks, timeout, unit);
  }

  @Override
  public void execute(Runnable command) {
    executorService.execute(command);    
  }

}
