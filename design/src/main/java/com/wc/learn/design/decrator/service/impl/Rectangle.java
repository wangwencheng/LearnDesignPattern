package com.wc.learn.design.decrator.service.impl;

import com.wc.learn.design.decrator.service.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
