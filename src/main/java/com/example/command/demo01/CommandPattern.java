package com.example.command.demo01;

/**
 * @author hzq
 * @date 2019/7/6 13:03
 */
public class CommandPattern {

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的call()方法...");
        invoker.call();
    }
}
