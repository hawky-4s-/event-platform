package com.livingoz.event.platform.api;

import com.livingoz.event.platform.core.EventHandler;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * An interface indicating that implementations are required to execute and are
 * capable of executing {@link Runnable}s in an asynchronous manner, whether by
 * spawning their own {@link Thread}s or using {@link Thread}s or processes
 * spawned for them.
 * 
 * @author <a href="mailto:ljnelson@gmail.com">Laird Nelson</a>
 */
public interface AsynchronousExecutor extends ExecutorService {

  /**
   * Executes the supplied {@link Runnable} in an asynchronous fashion and
   * returns immediately after asynchronous submission is complete.
   * 
   * @param runnable
   *          the {@link Runnable} to submit; may be {@code null}
   */
  public void executeAsynchronously(final Runnable runnable);
  
  public <V> Future<V> executeAsynchronously(final Callable<V> runnable);

  public <V> Future<V> handleEvent(final EventHandler<V> handler);
  
  public void start();
  
  public void shutdown();

}
