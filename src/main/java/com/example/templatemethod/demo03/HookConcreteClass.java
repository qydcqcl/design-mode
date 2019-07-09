package com.example.templatemethod.demo03;

/**
 * @author hzq
 * @date 2019/7/4 13:09
 */
public class HookConcreteClass extends HookAbstractClass {

    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写...");
    }

    @Override
    public boolean hookMethod2() {
        return false;
    }
}
