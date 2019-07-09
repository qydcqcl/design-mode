package com.example.chainofresponsibility.demo01;

/**
 * @author hzq
 * @date 2019/7/9 12:43
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);
        handler1.handleRequest("2");
    }
}
