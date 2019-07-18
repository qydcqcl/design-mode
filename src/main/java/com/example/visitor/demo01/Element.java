package com.example.visitor.demo01;

/**
 * 抽象元素类
 * @author hzq
 * @date 2019/7/18 12:38
 */
public interface Element {

    void accept(Visitor visitor);
}
