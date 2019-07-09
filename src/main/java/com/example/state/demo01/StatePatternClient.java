package com.example.state.demo01;

/**
 * @author hzq
 * @date 2019/7/9 13:16
 */
public class StatePatternClient {

    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
