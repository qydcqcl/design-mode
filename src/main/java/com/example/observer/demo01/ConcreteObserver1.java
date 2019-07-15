package com.example.observer.demo01;

/**
 * @author hzq
 * @date 2019/7/11 13:13
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应");
    }
}
