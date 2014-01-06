package com.livingoz.event.platform.api;

import java.util.List;

public interface EventNetwork {

  public List<EventNode> getNodes();

  public List<EventConsumer> getConsumers();

  public List<EventProducer> getProducers();

  public List<EventProcessor> getProcessors();

  public void start();

  public void pause();

  public void shutdown();

}