package com.livingoz.event.platform.api;


public interface EventConsumer<T extends Event> {

  public <T> void handleEvent(T event);

}
