package com.example.mediator.demo03;

/**
 * @author hzq
 * @date 2019/7/16 13:11
 */
public class SimpleMediatorPattern {

    public static void main(String[] args) {
        SimpleColleague c1,c2;
        c1 = new SimpleConcreteColleague1();
        c2 = new SimpleConcreteColleague2();
        c1.send();
        System.out.println("-----------------");
        c2.send();
    }
}
