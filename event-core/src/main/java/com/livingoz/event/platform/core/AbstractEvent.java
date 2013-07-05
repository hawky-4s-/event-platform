package com.livingoz.event.platform.core;

import com.livingoz.event.platform.api.Event;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractEvent<T, K, E> implements Event<T, K, E> {

  private K id;
  private E eventType;
  private Map<String, Object> metaData;
  private T payload;
  private Long occurenceTimestamp;
  
  public K getId() {
    return id;
  }
  
  protected void setId(K id) {
    this.id = id;
  }
  
  public E getEventType() {
    return eventType;
  }

  public void setEventType(E eventType) {
    this.eventType = eventType;
  }

  public Map<String, Object> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, Object> metaData) {
    this.metaData = metaData;
  }
  
  public void addMetaData(String key, Object value) {
    if (metaData == null) {
      metaData = new HashMap<String, Object>();
    }
    metaData.put(key, value);
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }
  
  public Long getOccurenceTimestamp() {
    return occurenceTimestamp;
  }
  
  public void setOccurenceTimestamp(Long occurenceTimestamp) {
    this.occurenceTimestamp = occurenceTimestamp;
  }
  
}
