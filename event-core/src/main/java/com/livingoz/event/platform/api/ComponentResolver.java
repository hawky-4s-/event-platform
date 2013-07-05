package com.livingoz.event.platform.api;

import java.util.List;

public interface ComponentResolver {

  public Component findComponent(String name);

  public List<Component> findAllComponents();

}
