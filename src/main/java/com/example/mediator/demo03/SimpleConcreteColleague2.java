package com.example.mediator.demo03;

/**
 * @author hzq
 * @date 2019/7/16 13:18
 */
public class SimpleConcreteColleague2 implements SimpleColleague {

    private SimpleMediator simpleMediator;

    public SimpleConcreteColleague2() {
        simpleMediator = SimpleMediator.getInstance();
        simpleMediator.register(this);
    }

    @Override
    public void receive() {
        System.out.println("具体同事类2：收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2：发出请求...");
        //请中介者转发
        simpleMediator.relay(this);
    }
}
