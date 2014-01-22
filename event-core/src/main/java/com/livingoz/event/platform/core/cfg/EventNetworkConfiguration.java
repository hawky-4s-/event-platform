package com.livingoz.event.platform.core.cfg;

import com.livingoz.event.platform.api.EventConsumer;
import com.livingoz.event.platform.api.EventNode;
import com.livingoz.event.platform.api.EventProcessor;
import com.livingoz.event.platform.api.EventProducer;

import java.util.List;

public class EventNetworkConfiguration {

  private List<EventNode> nodes;
  private List<EventProducer> producers;
  private List<EventConsumer> consumers;
  private List<EventProcessor> processors;

}
