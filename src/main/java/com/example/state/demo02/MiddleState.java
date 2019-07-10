package com.example.state.demo02;

/**
 * 具体状态类：中等
 * @author hzq
 * @date 2019/7/10 12:58
 */
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        context = state.context;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkStore() {
        if(score < 60){
            context.setState(new LowState(this));
        }else if(score >= 90){
            context.setState(new HighState(this));
        }
    }
}
