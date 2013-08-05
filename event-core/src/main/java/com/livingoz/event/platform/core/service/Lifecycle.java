package com.livingoz.event.platform.core.service;


public interface Lifecycle {

  public enum State {
    CREATED,
    STARTED,
    STOPPED,
    SUSPENDED,
    ACTIVATED,
    DESTROYED
  }

  public void create();

  public void start();

  public void stop();

  public void suspend();

  public void activate();

  public void destroy();

}
