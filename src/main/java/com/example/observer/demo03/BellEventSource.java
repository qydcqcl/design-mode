package com.example.observer.demo03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目标类：事件源，铃
 * @author hzq
 * @date 2019/7/15 12:54
 */
public class BellEventSource {

    private List<BellEventListener> listener;

    public BellEventSource() {
        listener = new ArrayList<>();
    }

    /**
     * 给事件源绑定监听器
     * @param eventListener
     */
    public void addPersonListener(BellEventListener eventListener){
        listener.add(eventListener);
    }

    /**
     * 事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
     * @param sound
     */
    public void ring(boolean sound){
        String type=sound?"上课铃":"下课铃";
        System.out.println(type+"响！");
        RingEvent event=new RingEvent(this, sound);
        //通知注册在该事件源上的所有监听器
        notifies(event);
    }

    private void notifies(RingEvent event) {
        BellEventListener bellEventListener = null;
        Iterator<BellEventListener> iterator = listener.iterator();
        while(iterator.hasNext()){
            bellEventListener = iterator.next();
            bellEventListener.heardBell(event);
        }
    }
}
