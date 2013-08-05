package com.livingoz.event.platform.api;


public interface Registry<T> {

  public void register(T object);

  public void unregister(T object);

}
