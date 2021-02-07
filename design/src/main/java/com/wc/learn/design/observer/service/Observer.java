package com.wc.learn.design.observer.service;

import com.wc.learn.design.observer.service.impl.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}