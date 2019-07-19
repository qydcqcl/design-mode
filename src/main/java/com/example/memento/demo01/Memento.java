package com.example.memento.demo01;

/**
 * 备忘录
 * @author hzq
 * @date 2019/7/19 12:34
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
