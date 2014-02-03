package com.livingoz.event.platform.api;


public interface EventProcessor<T extends Event> extends EventNode {

  public void registerPreProcessor(PreProcessor preProcessor);

  public void registerPostProcessor(PostProcessor postProcessor);

}
