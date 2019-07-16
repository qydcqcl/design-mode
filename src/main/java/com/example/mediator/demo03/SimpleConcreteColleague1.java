package com.example.mediator.demo03;

/**
 * 具体同事类
 * @author hzq
 * @date 2019/7/16 13:16
 */
public class SimpleConcreteColleague1 implements SimpleColleague {

    private SimpleMediator simpleMediator;

    public SimpleConcreteColleague1() {
        simpleMediator = SimpleMediator.getInstance();
        simpleMediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类1：收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1：发出请求...");
        //请中介者转发
        simpleMediator.relay(this);
    }
}
