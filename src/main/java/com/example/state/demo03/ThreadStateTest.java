package com.example.state.demo03;

/**
 * @author hzq
 * @date 2019/7/10 13:30
 */
public class ThreadStateTest {

    public static void main(String[] args) {
        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
