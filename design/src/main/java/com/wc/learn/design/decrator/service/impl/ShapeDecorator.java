package com.wc.learn.design.decrator.service.impl;

import com.wc.learn.design.decrator.service.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
