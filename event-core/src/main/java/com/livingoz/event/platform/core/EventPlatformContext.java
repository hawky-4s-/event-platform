package com.livingoz.event.platform.core;

import com.livingoz.event.platform.api.Event;
import com.livingoz.event.platform.api.EventConsumer;
import com.livingoz.event.platform.api.EventProducer;
import com.livingoz.event.platform.core.registry.EventConsumerRegistry;
import com.livingoz.event.platform.core.registry.EventProducerRegistry;
import com.livingoz.event.platform.core.registry.EventRegistry;

/**
 * User: chris
 * Date: 6/20/13
 */
public class EventPlatformContext {

  EventRegistry eventRegistry = new EventRegistry();
  EventProducerRegistry eventProducerRegistry = new EventProducerRegistry();
  EventConsumerRegistry eventConsumerRegistry = new EventConsumerRegistry();

  public EventPlatformContext() {
    init();
  }

  protected void init() {

  }

  public void registerEvent(Event event) {

  }

  public void registerEventProducer(EventProducer eventProducer) {

  }

  public void registerEventConsumer(EventConsumer eventConsumer) {

  }
}
