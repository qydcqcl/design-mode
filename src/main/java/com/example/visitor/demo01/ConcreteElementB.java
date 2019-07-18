package com.example.visitor.demo01;

/**
 * @author hzq
 * @date 2019/7/18 12:39
 */
public class ConcreteElementB implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        return "具体元素B的操作";
    }
}
