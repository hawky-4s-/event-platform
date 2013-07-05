package com.livingoz.event.platform.util;

import com.google.common.io.Resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Properties;


public class IoUtil {

  public static String readResourceAsString(String resourceName) {
    try {
      URL resource = Resources.getResource(resourceName);
      return Resources.toString(resource, Charset.forName("UTF-8"));
    } catch (IOException e) {
      // ignore
    }
    
    return null;
  }
  
  public static Properties readPropertiesFromClasspath(String resourceName) {
    try (InputStream in = IoUtil.class.getClassLoader().getResourceAsStream(resourceName)) {
      Properties properties = new Properties();
      if (in == null) {
        throw new RuntimeException("Unable to load '" + resourceName + "' from classpath.");
      }
      properties.load(in);
      return properties;
    } catch (IOException ioe) {
      throw new RuntimeException("Unable to load '" + resourceName + "' from classpath.");
    }
  }
  
}
