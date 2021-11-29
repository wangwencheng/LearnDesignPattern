package com.wc.learn.design;

import com.wc.learn.design.chain.service.FilterChain;
import com.wc.learn.design.chain.service.ModelRequest;
import com.wc.learn.design.chain.service.impl.Rule1;
import com.wc.learn.design.chain.service.impl.Rule2;
import com.wc.learn.design.decrator.service.Shape;
import com.wc.learn.design.decrator.service.impl.Circle;
import com.wc.learn.design.decrator.service.impl.Rectangle;
import com.wc.learn.design.decrator.service.impl.RedShapeDecorator;
import com.wc.learn.design.observer.service.impl.BinaryObserver;
import com.wc.learn.design.observer.service.impl.HexaObserver;
import com.wc.learn.design.observer.service.impl.OctalObserver;
import com.wc.learn.design.observer.service.impl.Subject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DesignApplication.class, args);
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        redCircle.draw();
//
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        redRectangle.draw();
//        Subject subject = new Subject();
//
//        new BinaryObserver(subject);
//        new OctalObserver(subject);
//        new HexaObserver(subject);
//
//        System.out.println("First change state to 10");
//        subject.setState(10);
//        System.out.println("Second change state to 15");
//        subject.setState(15);
        ModelRequest request = new ModelRequest(1, "责任链开始", "规则", "18");
        FilterChain filterChain=new FilterChain();
        filterChain.addFilter(new Rule1()).addFilter(new Rule2());
        filterChain.doFilter(request,filterChain);
    }
}
