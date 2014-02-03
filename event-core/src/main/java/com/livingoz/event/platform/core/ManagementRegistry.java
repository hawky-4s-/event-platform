package com.livingoz.event.platform.core;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Created by chris on 03.02.14.
 */
public class ManagementRegistry {

  private static ManagementRegistry INSTANCE = new ManagementRegistry();

  private static final String DOMAIN = "com.livingoz.event.platform";

  private static final MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();

  private ManagementRegistry(){
    // not allowed
  }

  public static void registerMBean(Object object, String name) {
    try {
      ObjectName objectName = ObjectName.getInstance(DOMAIN, "Name", name);
      if (!platformMBeanServer.isRegistered(objectName)) {
        platformMBeanServer.registerMBean(object, objectName);
      }
    } catch (MalformedObjectNameException | InstanceAlreadyExistsException
        | MBeanRegistrationException | NotCompliantMBeanException e) {
      throw new RuntimeException(e);
    }
  }

}
