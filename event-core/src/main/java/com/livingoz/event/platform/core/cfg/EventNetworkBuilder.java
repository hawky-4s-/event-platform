package com.livingoz.event.platform.core.cfg;

public class EventNetworkBuilder {

  private EventNetworkConfiguration configuration;

  public EventNetworkConfiguration build() {
    return configuration;
  }

  public EventNetworkBuilder addComponent() {
    return this;
  }

  public EventNetworkBuilder addProducer() {
    return this;
  }

  public EventNetworkBuilder addConsumer() {
    return this;
  }

  public EventNetworkBuilder addProcessor() {
    return this;
  }

}
