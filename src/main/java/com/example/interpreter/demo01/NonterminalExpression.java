package com.example.interpreter.demo01;

/**
 * 非终结符表达式类
 * @author hzq
 * @date 2019/7/20 12:50
 */
public class NonterminalExpression implements AbstractExpression {

    private AbstractExpression expression1;
    private AbstractExpression expression2;

    @Override
    public Object interpret(String info) {
        return null;
    }
}
