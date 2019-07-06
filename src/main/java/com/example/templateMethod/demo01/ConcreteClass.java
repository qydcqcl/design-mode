package com.example.templateMethod.demo01;

/**
 * @author hzq
 * @date 2019/7/4 12:51
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
