package com.wc.learn.design.observer.service.impl;

import com.wc.learn.design.observer.service.Observer;

public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BinaryObserver state change to " + this.subject.getState());
    }
}
