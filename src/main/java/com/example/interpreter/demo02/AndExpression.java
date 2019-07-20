package com.example.interpreter.demo02;

/**
 * @author hzq
 * @date 2019/7/20 12:58
 */
public class AndExpression implements Expression {

    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] split = info.split("的");
        return city.interpret(split[0]) && person.interpret(split[1]);
    }
}
