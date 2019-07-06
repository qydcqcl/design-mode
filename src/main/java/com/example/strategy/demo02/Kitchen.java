package com.example.strategy.demo02;

/**
 * 环境类：厨房
 * @author hzq
 * @date 2019/7/5 13:21
 */
public class Kitchen {

    private CrabCooking crabCooking;

    public CrabCooking getCrabCooking() {
        return crabCooking;
    }

    public void setCrabCooking(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }

    public void cookingMethod(){
        crabCooking.cookingMethod();
    }
}
