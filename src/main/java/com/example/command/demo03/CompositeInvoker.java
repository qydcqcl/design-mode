package com.example.command.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝结构: 调用者
 * @author hzq
 * @date 2019/7/8 13:18
 */
public class CompositeInvoker implements AbstractCommand{

    private List<AbstractCommand> childent = new ArrayList<>();

    public void add(AbstractCommand abstractCommand){
        childent.add(abstractCommand);
    }

    public void remove(AbstractCommand abstractCommand){
        childent.remove(abstractCommand);
    }

    public AbstractCommand getChild(int i){
        return childent.get(i);
    }

    @Override
    public void execute() {
        for(AbstractCommand abstractCommand : childent){
            abstractCommand.execute();
        }
    }
}
