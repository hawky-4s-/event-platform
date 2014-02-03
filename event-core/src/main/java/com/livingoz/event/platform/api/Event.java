package com.livingoz.event.platform.api;

import java.util.Map;

/**
 * An unique event which occurs at a specific timestamp and transports a payload.
 * It can contain metadata which describes its further semantics. 
 * 
 * @author chris
 *
 * @param <P> payload of event
 * @param <K> id of event
 * @param <T> type of event
 */
public interface Event<P, K, T> {

  public K getId();
  
  public T getEventType();
  
  public String getName();
  
  public Map<String, Object> getMetadata();
  
  public P getPayload();
  
  public Long getOccurenceTimestamp();
  
}
