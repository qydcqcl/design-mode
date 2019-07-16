package com.example.mediator.demo01;

/**
 * @author hzq
 * @date 2019/7/15 13:38
 */
public class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        //请中介者转发
        mediator.relay(this);
    }
}
