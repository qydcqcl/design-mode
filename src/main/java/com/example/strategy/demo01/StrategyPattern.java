package com.example.strategy.demo01;

/**
 * @author hzq
 * @date 2019/7/5 13:07
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();

        Context context = new Context();

        context.setStrategy(strategyA);
        context.strategyMethod();
        System.out.println("-----------------------------");

        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
    }
}
