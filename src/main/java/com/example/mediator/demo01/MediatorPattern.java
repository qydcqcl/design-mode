package com.example.mediator.demo01;

/**
 * @author hzq
 * @date 2019/7/15 13:40
 */
public class MediatorPattern {

    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
