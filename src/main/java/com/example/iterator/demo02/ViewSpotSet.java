package com.example.iterator.demo02;

/**
 * 抽象聚合：婺源景点集接口
 * @author hzq
 * @date 2019/7/17 12:44
 */
public interface ViewSpotSet {

    void add(WyViewSpot obj);

    void remove(WyViewSpot obj);

    ViewSpotIterator getIterator();
}
