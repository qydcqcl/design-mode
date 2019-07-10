package com.example.state.demo02;

/**
 * 抽象状态类：
 * @author hzq
 * @date 2019/7/10 12:48
 */
public abstract class AbstractState {

    protected ScoreContext context;
    protected String stateName;
    protected int score;

    public abstract void checkStore();

    public void addScore(int i){
        score += i;
        System.out.print("加上：" + i + "分，\t当前分数：" + score);
        checkStore();
        System.out.println("分，\t当前状态：" + context.getState().stateName);
    }
}
