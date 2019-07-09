package com.example.state.demo01;

/**
 * 环境类
 * @author hzq
 * @date 2019/7/9 13:16
 */
public class Context {

    private State state;

    public Context() {
        //定义环境的初始状态
        state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle(){
        state.handle(this);
    }
}
