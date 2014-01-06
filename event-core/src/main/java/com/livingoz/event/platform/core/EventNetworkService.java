package com.livingoz.event.platform.core;

import com.livingoz.event.platform.api.EventNetwork;
import com.livingoz.event.platform.core.cfg.EventNetworkBuilder;
import com.livingoz.event.platform.core.cfg.EventNetworkConfiguration;

/**
 * User: chris
 * Date: 7/5/13
 */
public class EventNetworkService {

  public static EventNetwork buildEventNetwork(EventNetworkConfiguration configuration) {
    return null;
  }

  public static EventNetworkBuilder getBuilder() {
    return new EventNetworkBuilder();
  }



}
