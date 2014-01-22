package com.livingoz.event.platform.core;

import com.livingoz.event.platform.api.EventNetwork;
import com.livingoz.event.platform.core.cfg.EventNetworkBuilder;
import com.livingoz.event.platform.core.cfg.EventNetworkConfiguration;

import java.util.HashMap;

/**
 * User: chris
 * Date: 7/5/13
 */
public class EventNetworkService {

  private static HashMap<String,EventNetwork> eventNetworks = new HashMap<>();

  public static EventNetwork buildEventNetwork(EventNetworkConfiguration configuration) {
    return null;
  }

  public static EventNetworkBuilder builder() {
    return new EventNetworkBuilder();
  }

  public EventNetwork getEventNetworkById(String id) {
    EventNetwork eventNetwork = eventNetworks.get(id);
    if (eventNetwork == null) {
      throw new RuntimeException("Unable to find event network with id '" + id + "'");
    }

    return eventNetwork;
  }


}
