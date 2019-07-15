package com.example.observer.demo03;

import java.util.EventObject;

/**
 * @author hzq
 * @date 2019/7/15 12:47
 */
public class RingEvent extends EventObject {

    /**
     * true 上课铃声 false 下课铃声
     */
    private boolean sound;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source) {
        super(source);
    }

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
