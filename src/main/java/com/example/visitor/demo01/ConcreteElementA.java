package com.example.visitor.demo01;

/**
 * @author hzq
 * @date 2019/7/18 12:38
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作";
    }
}
