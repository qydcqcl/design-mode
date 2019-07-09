package com.example.chainofresponsibility.demo02;

/**
 * 抽象处理者: 领导类
 * @author hzq
 * @date 2019/7/9 12:56
 */
public abstract class Leader {

    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    /**
     * 处理请求的方法
     * @param leaveDays
     */
    public abstract void handleRequest(int leaveDays);
}
