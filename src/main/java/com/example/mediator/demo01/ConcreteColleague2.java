package com.example.mediator.demo01;

/**
 * @author hzq
 * @date 2019/7/15 13:38
 */
public class ConcreteColleague2 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
