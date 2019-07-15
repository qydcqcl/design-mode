package com.example.observer.demo03;

/**
 * @author hzq
 * @date 2019/7/15 12:44
 */
public class BellEventTest {

    public static void main(String[] args) {
        BellEventSource source = new BellEventSource();
        source.addPersonListener(new TeachEventListener());
        source.addPersonListener(new StuEventListener());
        //上课
        source.ring(true);
        System.out.println("------------");
        source.ring(false);
    }
}
