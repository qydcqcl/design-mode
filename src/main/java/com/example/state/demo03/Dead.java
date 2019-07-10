package com.example.state.demo03;

/**
 * 具体状态类：死亡状态
 * @author hzq
 * @date 2019/7/10 13:24
 */
public class Dead extends ThreadState {

    public Dead() {
        stateName = "死亡状态";
        System.out.println("当前线程处于：死亡状态.");
    }
}
