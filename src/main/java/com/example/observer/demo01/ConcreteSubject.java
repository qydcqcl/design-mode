package com.example.observer.demo01;

/**
 * 具体目标
 * @author hzq
 * @date 2019/7/11 13:12
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("================");

        for(Observer observer : observers){
            observer.response();
        }
    }
}
