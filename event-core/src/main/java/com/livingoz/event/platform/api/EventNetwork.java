package com.livingoz.event.platform.api;

/**
 * User: hawky4s
 * Date: 29/07/13
 */
public interface EventNetwork {

  public EventNetwork addProducer();

  public EventNetwork addConsumer();

  public EventNetwork addProcessor();

  public EventNetwork addChannel();

  public EventNetwork to();

}