package com.livingoz.event.platform.core.resolver;

import com.livingoz.event.platform.api.Component;
import com.livingoz.event.platform.api.Resolver;

import java.util.Set;

/**
 * User: chris
 * Date: 7/5/13
 */
public class ComponentResolver implements Resolver<Component> {

  @Override
  public Component findClass(String name) {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
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
