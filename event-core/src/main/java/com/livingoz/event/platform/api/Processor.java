package com.livingoz.event.platform.api;

/**
 * Created by chris on 02.02.14.
 */
public interface Processor<T extends Event> {

  public T process(T event);

}
