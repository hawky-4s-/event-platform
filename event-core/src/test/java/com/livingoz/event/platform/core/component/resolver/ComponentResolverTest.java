package com.livingoz.event.platform.core.component.resolver;

import com.livingoz.event.platform.api.Component;
import com.livingoz.event.platform.core.resolver.ComponentResolver;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertTrue;

public class ComponentResolverTest {

  @Test
  public void resolveComponentFromClasspath() {
    ComponentResolver componentResolver = new ComponentResolver();

    Set<Class<? extends Component>> components = componentResolver.findAllClassesByType();
    assertTrue(components.contains(DummyComponent.class));
  }
}
