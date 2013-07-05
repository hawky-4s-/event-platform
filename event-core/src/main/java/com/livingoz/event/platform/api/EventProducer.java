package com.livingoz.event.platform.api;


public interface EventProducer<T extends Event> {

  public void produce();

}
