package com.livingoz.event.platform.core.dispatcher;

import com.livingoz.event.platform.api.Dispatcher;
import com.livingoz.event.platform.api.Event;

/**
 * User: chris
 * Date: 6/20/13
 */
public class EventDispatcher implements Dispatcher {
  private static EventDispatcher ourInstance = new EventDispatcher();

  public static EventDispatcher getInstance() {
    return ourInstance;
  }

  private EventDispatcher() {
  }

  @Override
  public void dispatch(Event event) {
    //To change body of implemented methods use File | Settings | File Templates.
  }
}
