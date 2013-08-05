package com.livingoz.event.platform.api;

/**
 * User: chris
 * Date: 7/4/13
 */
public interface Channel {

  public void push(Event event);

  public Event poll();

}
