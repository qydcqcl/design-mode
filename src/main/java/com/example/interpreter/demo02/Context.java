package com.example.interpreter.demo02;

/**
 * 环境类
 * @author hzq
 * @date 2019/7/20 13:00
 */
public class Context {

    private String[] citys = {"韶关", "广州"};
    private String[] persons = {"老人","妇女","儿童"};

    private Expression cityPerson;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        cityPerson = new AndExpression(city,person);
    }

    public void freeRide(String info){
        boolean ok = cityPerson.interpret(info);
        if (ok) {
            System.out.println("您是"+info+"，您本次乘车免费！");
        } else {
            System.out.println(info+"，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
