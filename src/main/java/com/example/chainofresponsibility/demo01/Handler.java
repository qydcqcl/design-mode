package com.example.chainofresponsibility.demo01;

/**
 * 抽象处理者
 * @author hzq
 * @date 2019/7/9 12:44
 */
public abstract class Handler {

    public abstract void handleRequest(String request);

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
}
