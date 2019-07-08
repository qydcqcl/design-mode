package com.example.command.demo03;

/**
 * 树叶结构: 具体的命令1
 * @author hzq
 * @date 2019/7/8 13:16
 */
public class ConcreteCommand1 implements AbstractCommand{

    private CompositeReceiver compositeReceiver;

    public ConcreteCommand1() {
        compositeReceiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        compositeReceiver.action1();
    }
}
