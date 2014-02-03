package com.livingoz.event.platform.core;

/**
 * Created by chris on 03.02.14.
 */
public interface EventHandler<E> {

  public E handleEvent(E event);

}
