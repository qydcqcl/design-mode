package com.example.memento.demo01;

/**
 * 管理者
 * @author hzq
 * @date 2019/7/19 12:37
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
