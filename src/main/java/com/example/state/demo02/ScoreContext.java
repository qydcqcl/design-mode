package com.example.state.demo02;

/**
 * 环境类
 * @author hzq
 * @date 2019/7/10 12:49
 */
public class ScoreContext {

    private AbstractState state;

    public ScoreContext() {
        state = new LowState(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void add(int i){
        state.addScore(i);
    }
}
