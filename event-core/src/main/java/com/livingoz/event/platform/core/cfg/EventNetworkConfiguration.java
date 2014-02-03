package com.livingoz.event.platform.core.cfg;

import com.livingoz.event.platform.api.*;

import java.util.ArrayList;
import java.util.List;

public class EventNetworkConfiguration {

  protected boolean autoDiscoveryEnabled = true;
  protected ArrayList<Component> components;
  protected ArrayList<EventProducer> producers;
  protected ArrayList<EventConsumer> consumers;
  protected ArrayList<EventProcessor> processors;

  public EventNetwork buildEventNetwork() {
    // TODO: startup network
    return null;
  }

  public <T extends Component> void addComponent(T component) {
    components.add(component);
  }

  public <T extends EventProducer> void addProducer(T producer) {
    producers.add(producer);
  }

  public <T extends EventConsumer> void addConsumer(T consumer) {
    consumers.add(consumer);
  }

  public <T extends EventProcessor> void addProcessor(T processor) {
    processors.add(processor);
  }

}
