package com.livingoz.event.platform.core.executor;

import java.util.logging.Level;

class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
  
  private final DefaultExecutorService UncaughtExceptionHandler;

  UncaughtExceptionHandler(DefaultExecutorService seExecutorServiceBean) {
    UncaughtExceptionHandler = seExecutorServiceBean;
  }

  @Override
  public void uncaughtException(Thread t, Throwable e) {
    UncaughtExceptionHandler.logger.log(Level.SEVERE, "An error occured in thread[" + t.getName() + "]", e);
  }
}