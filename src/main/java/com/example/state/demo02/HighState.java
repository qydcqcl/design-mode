package com.example.state.demo02;

/**
 * 具体状态类：优秀
 * @author hzq
 * @date 2019/7/10 12:59
 */
public class HighState extends AbstractState {

    public HighState(AbstractState state) {
        context = state.context;
        stateName = "优秀";
        score = state.score;
    }

    @Override
    public void checkStore() {
        if(score < 60){
            context.setState(new LowState(this));
        }else if(score < 90){
            context.setState(new MiddleState(this));
        }
    }
}
