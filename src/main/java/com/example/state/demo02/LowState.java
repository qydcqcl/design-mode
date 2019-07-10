package com.example.state.demo02;

/**
 * 具体状态类：不及格
 * @author hzq
 * @date 2019/7/10 12:53
 */
public class LowState extends AbstractState {

    public LowState(ScoreContext scoreContext) {
        context = scoreContext;
        stateName = "不及格";
        score = 0;
    }

    public LowState(AbstractState state) {
        context = state.context;
        stateName = "不及格";
        score = state.score;
    }

    @Override
    public void checkStore() {
        if(score >= 90){
            context.setState(new HighState(this));
        }else if(score >= 60){
            context.setState(new MiddleState(this));
        }
    }
}
