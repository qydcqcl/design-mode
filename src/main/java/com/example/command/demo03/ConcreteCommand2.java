package com.example.command.demo03;

/**
 * 树叶结构: 具体的命令2
 * @author hzq
 * @date 2019/7/8 13:17
 */
public class ConcreteCommand2 implements AbstractCommand {

    private CompositeReceiver compositeReceiver;

    public ConcreteCommand2() {
        compositeReceiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        compositeReceiver.action2();
    }
}
