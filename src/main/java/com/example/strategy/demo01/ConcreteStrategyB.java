package com.example.strategy.demo01;

/**
 * 具体策略类B
 * @author hzq
 * @date 2019/7/5 13:10
 */
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
