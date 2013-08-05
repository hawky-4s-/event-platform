package com.livingoz.event.platform.core.resolver;

import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

import java.lang.annotation.Annotation;
import java.util.Set;

/**
 * User: hawky4s
 * Date: 25/07/13
 */
public class ClassResolver {

  public static Set<Class<?>> findClassesByAnnotation(Class<? extends Annotation> annotation) {
    Reflections reflections = new Reflections(
        new ConfigurationBuilder().addUrls(ClasspathHelper.forClassLoader())
    );

    Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(annotation);

    return annotatedClasses;
  }

  public static <T> Set<Class<? extends T>> findClassesByType(Class<T> type) {
    Reflections reflections = new Reflections(
        new ConfigurationBuilder().addUrls(ClasspathHelper.forClassLoader())
    );

    Set<Class<? extends T>> subClasses = reflections.getSubTypesOf(type);

    return subClasses;
  }

}
