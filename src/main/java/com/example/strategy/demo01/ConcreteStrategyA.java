package com.example.strategy.demo01;

/**
 * 具体策略类
 * @author hzq
 * @date 2019/7/5 13:09
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
