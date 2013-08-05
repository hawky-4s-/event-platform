package com.livingoz.event.platform.core.cfg;

import com.livingoz.event.platform.api.EventPlatformConfiguration;

/**
 * User: hawky4s
 * Date: 26/07/13
 */
public class ConfigurationBuilder {

  private ConfigurationBuilder() {}

  public static EventPlatformConfiguration createConfiguration() {
    return new EventPlatformConfigurationImpl();
  }

  public EventPlatformConfiguration produceEvent() {
    return this;
  }

  public EventPlatformConfiguration consumeEvent() {
    return this;
  }

  public EventPlatformConfiguration processEvent() {
    return this;
  }


  public EventPlatformConfiguration build() {}

}
