package com.example.state.demo01;

/**
 * 具体状态A类
 * @author hzq
 * @date 2019/7/9 13:18
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
