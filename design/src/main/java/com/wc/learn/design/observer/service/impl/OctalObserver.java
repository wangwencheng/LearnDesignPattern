package com.wc.learn.design.observer.service.impl;

import com.wc.learn.design.observer.service.Observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("OctalObserver state change to " + this.subject.getState());
    }
}
