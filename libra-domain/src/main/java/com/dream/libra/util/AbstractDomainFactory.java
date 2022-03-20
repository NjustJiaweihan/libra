package com.dream.libra.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

@Slf4j
public abstract class AbstractDomainFactory<T> {

    private final Map<String, Consumer<T>> parts = new HashMap<>();

    private void init(){
        Class<?> clazz = this.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            Part part = method.getAnnotation(Part.class);
            if(null != part){
                try {
                    method.setAccessible(true);
                    parts.put(part.value(), (Consumer<T>) method.invoke(this));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    log.warn("AbstractDomainFactory init error", e);
                }
            }
        }
    }

    public AbstractDomainFactory(){
        init();
    }

    public T build(T t, String...parts){
        if(Objects.isNull(t)){
            return null;
        }
        Consumer<T> consumer;
        for (String part : parts) {
            consumer = this.parts.get(part);
            consumer.accept(t);
        }
        return t;
    }
}
