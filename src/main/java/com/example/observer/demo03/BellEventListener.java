package com.example.observer.demo03;

import java.util.EventListener;

/**
 * 抽象观察者：铃声事件监听器
 * @author hzq
 * @date 2019/7/15 12:45
 */
public interface BellEventListener extends EventListener {

    /**
     * 事件处理方法，听到铃声
     * @param e
     */
    void heardBell(RingEvent e);
}
