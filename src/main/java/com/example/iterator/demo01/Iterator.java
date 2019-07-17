package com.example.iterator.demo01;

/**
 * 抽象迭代器
 * @author hzq
 * @date 2019/7/17 12:29
 */
public interface Iterator {

    Object first();
    Object next();
    boolean hasNext();
}
