package com.example.iterator.demo02;

/**
 * 抽象迭代器：婺源景点迭代器接口
 * @author hzq
 * @date 2019/7/17 12:44
 */
public interface ViewSpotIterator {

    boolean hasNext();

    WyViewSpot first();

    WyViewSpot next();

    WyViewSpot previous();

    WyViewSpot last();
}
