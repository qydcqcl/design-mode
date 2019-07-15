package com.example.observer.demo01;

/**
 * @author hzq
 * @date 2019/7/11 13:14
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应");
    }
}
