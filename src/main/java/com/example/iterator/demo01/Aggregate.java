package com.example.iterator.demo01;

/**
 * 抽象聚合
 * @author hzq
 * @date 2019/7/17 12:28
 */
public interface Aggregate {

    void add(Object o);
    void remove(Object o);
    Iterator getIterator();
}
