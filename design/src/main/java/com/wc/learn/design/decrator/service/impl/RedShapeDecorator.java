package com.wc.learn.design.decrator.service.impl;

import com.wc.learn.design.decrator.service.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();;
        System.out.println("Shape Decorator Red");
    }
}
