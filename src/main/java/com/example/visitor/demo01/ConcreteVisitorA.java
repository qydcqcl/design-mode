package com.example.visitor.demo01;

/**
 * @author hzq
 * @date 2019/7/18 12:37
 */
public class ConcreteVisitorA implements Visitor {


    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问-->" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问-->" + concreteElementB.operationB());
    }
}
