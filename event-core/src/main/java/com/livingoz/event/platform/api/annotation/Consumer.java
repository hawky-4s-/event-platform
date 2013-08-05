package com.livingoz.event.platform.api.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Consumer {
  // specify which events it consumes
  // from which channel it reads them

  //Class<? extends Event>[] eventTypes() default { AbstractEvent.class };


}
