package com.livingoz.event.platform.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Producer {
  // specify which events it produces
  // to which channel it sends it

  Event[] emitsEvents();

}
