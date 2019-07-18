package com.example.visitor.demo01;

/**
 * @author hzq
 * @date 2019/7/18 12:36
 */
public class VisitorPattern {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitor = new ConcreteVisitorA();
        objectStructure.accpet(visitor);
        System.out.println("=================================");

        visitor = new ConcreteVisitorB();
        objectStructure.accpet(visitor);
    }
}
