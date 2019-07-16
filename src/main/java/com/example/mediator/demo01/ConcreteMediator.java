package com.example.mediator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzq
 * @date 2019/7/15 13:29
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for(Colleague ob:colleagues) {
            if(!ob.equals(cl)) {
                ((Colleague)ob).receive();
            }
        }
    }
}
