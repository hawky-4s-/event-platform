package com.livingoz.event.platform.core;

import java.util.concurrent.Callable;

public interface AsyncEventHandler<E> extends EventHandler<Callable<E>> {
}
