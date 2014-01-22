package com.livingoz.event.platform.api;

/**
 * Created by hawky4s on 16/01/14.
 */
public interface AsyncEventProcessor<T extends Event> extends EventProcessor {

  public void processAsynchronous(T event);

}
