package com.livingoz.event.platform.core.resolver;

import com.livingoz.event.platform.api.Component;
import com.livingoz.event.platform.api.Resolver;
import com.livingoz.event.platform.core.EventNetworkException;

import java.util.Set;

/**
 * User: chris
 * Date: 7/5/13
 */
public class ComponentResolver implements Resolver<Component> {

  @Override
  public Class<? extends Component> findClass(String name) {
    try {
      Set<Class<?>> classesByType = ClassResolver.findClassesByType(Class.forName(name));
      if (classesByType.size() == 1) {
        return (Class<? extends Component>) classesByType.iterator().next();
      } else if (classesByType.isEmpty()) {
        return null;
      } else {
        throw new EventNetworkException("Too many compatible classes found.");
      }
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Set<Class<? extends Component>> findAllClassesByType() {
    return ClassResolver.findClassesByType(Component.class);
  }

  @Override
  public Set<Class<?>> findAllClassesByAnnotation() {
    return ClassResolver.findClassesByAnnotation(com.livingoz.event.platform.api.annotation.Component.class);
  }

}
