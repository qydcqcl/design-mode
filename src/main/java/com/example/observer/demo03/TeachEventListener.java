package com.example.observer.demo03;

/**
 * 具体观察者类：老师事件监听器
 * @author hzq
 * @date 2019/7/15 12:48
 */
public class TeachEventListener implements BellEventListener {

    @Override
    public void heardBell(RingEvent e) {
        if(e.isSound()){
            System.out.println("老师上课了...");
        }else{
            System.out.println("老师下课了...");
        }
    }
}
