package com.example.observer.demo01;

/**
 * @author hzq
 * @date 2019/7/11 13:11
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
    }
}
