package com.livingoz.event.platform.api;

/**
 * User: chris
 * Date: 6/20/13
 */
public interface PriorityQueue {

  public void enqueue(QueueItem queueItem);

  public QueueItem dequeue();

}
