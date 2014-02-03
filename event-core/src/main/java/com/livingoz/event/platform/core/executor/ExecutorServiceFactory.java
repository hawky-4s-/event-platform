package com.livingoz.event.platform.core.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceFactory {

  private static final int NUM_THREADS = 5;

  public static ExecutorService createExecutorService() {
    return Executors.newFixedThreadPool(
        NUM_THREADS,
        new ThreadFactoryBuilder().setNameFormat("AsynchronousExecutor-Pool-%d")
            .setUncaughtExceptionHandler(new UncaughtExceptionHandler())
            .build());

  }

}
