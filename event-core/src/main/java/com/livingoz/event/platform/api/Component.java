package com.livingoz.event.platform.api;

import com.livingoz.event.platform.core.EventPlatformContext;

/**
 * User: chris
 * Date: 7/5/13
 */
public interface Component {

  public EventPlatformContext getEventPlatformContext();

  public void setEventPlatformContext(EventPlatformContext context);

}
