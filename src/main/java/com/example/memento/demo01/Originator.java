package com.example.memento.demo01;

/**
 * 发起人
 * @author hzq
 * @date 2019/7/19 12:35
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
