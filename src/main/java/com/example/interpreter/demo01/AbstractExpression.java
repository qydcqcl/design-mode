package com.example.interpreter.demo01;

/**
 * 抽象表达式
 * @author hzq
 * @date 2019/7/20 12:49
 */
public interface AbstractExpression {

    /**
     * 解释方法
     * @param info
     * @return
     */
    Object interpret(String info);
}
