package com.livingoz.event.platform.api;


public interface EventProcessor<T extends Event> {

  public void process(T event);

}
