package com.example.visitor.demo01;

/**
 * 抽象访问者
 * @author hzq
 * @date 2019/7/18 12:36
 */
public interface Visitor {

    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
