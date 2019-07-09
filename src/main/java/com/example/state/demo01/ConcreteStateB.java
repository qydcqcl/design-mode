package com.example.state.demo01;

/**
 * @author hzq
 * @date 2019/7/9 13:20
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
