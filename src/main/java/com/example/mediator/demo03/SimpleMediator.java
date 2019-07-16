package com.example.mediator.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * 简单单例中介者
 * @author hzq
 * @date 2019/7/16 13:11
 */
public class SimpleMediator {

    private static SimpleMediator simpleMediator = new SimpleMediator();

    private List<SimpleColleague> simpleColleagues = new ArrayList<>();

    private SimpleMediator(){}

    public static SimpleMediator getInstance(){
        return simpleMediator;
    }

    public void register(SimpleColleague simpleColleague){
        if(!simpleColleagues.contains(simpleColleague)){
            simpleColleagues.add(simpleColleague);
        }
    }

    public void relay(SimpleColleague simpleColleague){
        for(SimpleColleague simpleColleague1 : simpleColleagues){
            if(!simpleColleague.equals(simpleColleague1)){
                simpleColleague1.receive();
            }
        }
    }
}
