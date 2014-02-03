package com.livingoz.event.platform.api;


public interface EventConsumer<T extends Event> {

  public <T> void handleEvent(T event);

  public void registerPreProcessor(PreProcessor preProcessor);

  public void registerPostProcessor(PostProcessor postProcessor);

}
