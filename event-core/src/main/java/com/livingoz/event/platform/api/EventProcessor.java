package com.livingoz.event.platform.api;


public interface EventProcessor extends Processor {

  public void registerPreProcessor(PreProcessor preProcessor);

  public void registerPostProcessor(PostProcessor postProcessor);

}
