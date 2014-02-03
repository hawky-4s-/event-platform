package com.livingoz.event.platform.api;

/**
 * EventProducers (Components) produce events which are then dispatched by the EventDispatcher to
 * @param <T>
 */
public interface EventProducer<T extends Event> extends EventNode {

  public void produce();

  public void registerPreProcessor(PreProcessor preProcessor);

  public void registerPostProcessor(PostProcessor postProcessor);

}
