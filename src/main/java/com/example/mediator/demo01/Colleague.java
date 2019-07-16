package com.example.mediator.demo01;

/**
 * 抽象同事类
 * @author hzq
 * @date 2019/7/15 13:25
 */
public abstract class Colleague {

    protected Mediator mediator;

    public abstract void receive();

    public abstract void send();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
