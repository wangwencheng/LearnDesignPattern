package com.wc.learn.design.observer.service.impl;

import com.wc.learn.design.observer.service.Observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObserver state change to " + subject.getState());
    }
}

