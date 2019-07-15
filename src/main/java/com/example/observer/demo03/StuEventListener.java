package com.example.observer.demo03;

/**
 * 具体观察者类：学生事件监听器
 * @author hzq
 * @date 2019/7/15 12:52
 */
public class StuEventListener implements BellEventListener {

    @Override
    public void heardBell(RingEvent e) {
        if(e.isSound()){
            System.out.println("学生上课了...");
        }else{
            System.out.println("学生下课了...");
        }
    }
}
