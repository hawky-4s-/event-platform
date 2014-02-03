package com.livingoz.event.platform.core;

public class EventNetworkException extends RuntimeException {

  public EventNetworkException() {
    super();
  }

  public EventNetworkException(String message) {
    super(message);
  }

  public EventNetworkException(Throwable throwable) {
    super(throwable);
  }

  public EventNetworkException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
