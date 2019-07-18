package com.example.visitor.demo01;

/**
 * @author hzq
 * @date 2019/7/18 12:39
 */
public class ConcreteVisitorB implements Visitor{

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者B访问-->" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者B访问-->" + concreteElementB.operationB());
    }
}
