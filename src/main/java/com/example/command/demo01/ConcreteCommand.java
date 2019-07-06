package com.example.command.demo01;

/**
 * 具体的命令
 * @author hzq
 * @date 2019/7/6 12:59
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(){
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
