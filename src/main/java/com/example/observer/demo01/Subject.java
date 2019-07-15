package com.example.observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 * @author hzq
 * @date 2019/7/11 13:11
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
