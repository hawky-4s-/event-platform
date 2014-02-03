package com.livingoz.event.platform.core.cfg;

import com.livingoz.event.platform.api.Component;
import com.livingoz.event.platform.api.EventConsumer;
import com.livingoz.event.platform.api.EventProcessor;
import com.livingoz.event.platform.api.EventProducer;
import com.livingoz.event.platform.core.resolver.ComponentResolver;

public class EventNetworkBuilder {

  protected EventNetworkConfiguration configuration = new EventNetworkConfiguration();
  protected ComponentResolver componentResolver = new ComponentResolver();

  public EventNetworkConfiguration build() {
    return configuration;
  }

  public <T extends Component> EventNetworkBuilder addComponent(Class<T> componentClazz) {
    // need to instantiate class
    return this;
  }

  public <T extends Component> EventNetworkBuilder addComponent(T component) {
    configuration.addComponent(component);
    return this;
  }

  public <T extends EventProducer> EventNetworkBuilder addProducer(Class<T> producerClazz) {
    return this;
  }

  public <T extends EventProducer> EventNetworkBuilder addProducer(T producer) {
    return this;
  }

  public <T extends EventConsumer> EventNetworkBuilder addConsumer(Class<T> consumerClazz) {
    return this;
  }

  public <T extends EventConsumer> EventNetworkBuilder addConsumer(T consumer) {
    return this;
  }

  public <T extends EventProcessor> EventNetworkBuilder addProcessor(Class<T> processorClazz) {
    return this;
  }

  public <T extends EventProcessor> EventNetworkBuilder addProcessorr(T processor) {
    return this;
  }

}
