package com.example.strategy.demo01;

/**
 * @author hzq
 * @date 2019/7/5 13:10
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
