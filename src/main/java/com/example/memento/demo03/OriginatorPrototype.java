package com.example.memento.demo03;

/**
 * 发起人原型
 * @author hzq
 * @date 2019/7/19 13:03
 */
public class OriginatorPrototype implements Cloneable {

    String state;

    public OriginatorPrototype() {
    }

    public OriginatorPrototype(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public OriginatorPrototype createMemento(){
        return this.clone();
    }

    public void restoreMemento(OriginatorPrototype originatorPrototype){
        this.setState(originatorPrototype.getState());
    }

    @Override
    protected OriginatorPrototype clone() {
        try {
            return (OriginatorPrototype) super.clone();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
