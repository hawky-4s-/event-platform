package com.livingoz.event.platform.api;

import java.util.Map;

/**
 * An unique event which occurs at a specific timestamp and transports a payload.
 * It can contain metadata which describes its further semantics.
 *
 * @param <T> payload of event
 * @param <K> id of event
 * @param <E> type of event
 * @author chris
 */
public interface Event<T, K, E> {

  public K getId();

  public E getEventType();

  public String getName();

  public Map<String, Object> getMetadata();

  public T getPayload();

  public Long getOccurenceTimestamp();

}
