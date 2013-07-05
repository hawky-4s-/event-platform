package com.livingoz.event.platform.api;


public interface Dispatcher<T extends Event> {

  public void dispatch(Event event);

}
