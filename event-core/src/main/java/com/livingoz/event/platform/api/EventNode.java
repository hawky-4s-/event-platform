package com.livingoz.event.platform.api;

import java.util.List;

/**
 * EventNode are the superclass which represents nodes producing or consuming events.
 */
public interface EventNode extends Processor {

  public String getName();

  public void setName(String nodeName);

  public List<Event> consumesEvents();

  public void start();

  public void stop();

}
