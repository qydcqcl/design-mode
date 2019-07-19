package com.example.memento.demo03;

/**
 * @author hzq
 * @date 2019/7/19 13:02
 */
public class PrototypeMemento {

    public static void main(String[] args) {
        OriginatorPrototype or = new OriginatorPrototype();
        PrototypeCaretaker cr = new PrototypeCaretaker();
        or.setState("S0");
        System.out.println("初始状态:"+or.getState());
        //保存状态
        cr.setOriginatorPrototype(or.createMemento());
        or.setState("S1");
        System.out.println("新的状态:"+or.getState());
        //恢复状态
        or.restoreMemento(cr.getOriginatorPrototype());
        System.out.println("恢复状态:"+or.getState());
    }
}
