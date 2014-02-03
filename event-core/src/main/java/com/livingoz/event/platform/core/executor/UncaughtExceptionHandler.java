package com.livingoz.event.platform.core.executor;

import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

  private final Logger logger = Logger.getLogger(UncaughtExceptionHandler.class.getName());

  @Override
  public void uncaughtException(Thread t, Throwable e) {
    logger.log(Level.SEVERE, "An error occured in thread[" + t.getName() + "]", e);
  }
}