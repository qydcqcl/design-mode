package com.example.templateMethod.demo03;

/**
 * @author hzq
 * @date 2019/7/4 13:05
 */
public abstract class HookAbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod(){
        abstractMethod1();
        hookMethod1();
        if(hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }

    public void hookMethod1() {

    }

    public boolean hookMethod2() {
        return true;
    }

    public void specificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();
}
