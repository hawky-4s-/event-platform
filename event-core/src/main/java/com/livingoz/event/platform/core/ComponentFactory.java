package com.livingoz.event.platform.core;

import com.livingoz.event.platform.api.Component;

public interface ComponentFactory<T extends Component> {

  public T getComponent();

}
