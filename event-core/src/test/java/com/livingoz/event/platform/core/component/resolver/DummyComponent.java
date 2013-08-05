package com.livingoz.event.platform.core.component.resolver;

import com.livingoz.event.platform.api.annotation.Component;
import com.livingoz.event.platform.core.EventPlatformContext;
import com.livingoz.event.platform.core.component.DefaultComponent;

@Component
public class DummyComponent extends DefaultComponent {

  @Override
  public EventPlatformContext getEventPlatformContext() {
    return null;  //To change body of implemented methods use File | Settings | File Templates.
  }

  @Override
  public void setEventPlatformContext(EventPlatformContext context) {
    //To change body of implemented methods use File | Settings | File Templates.
  }

}
