package com.livingoz.event.platform.api;

import java.util.Set;

public interface Resolver<T> {

  public Class<? extends T> findClass(String name);

  public Set<Class<? extends T>> findAllClassesByType();

  public Set<Class<?>> findAllClassesByAnnotation();

}
