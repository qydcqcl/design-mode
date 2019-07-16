package com.example.mediator.demo01;

/**
 * 抽象中介者
 * @author hzq
 * @date 2019/7/15 13:23
 */
public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague cl);
}
