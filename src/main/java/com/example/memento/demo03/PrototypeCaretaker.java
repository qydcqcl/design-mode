package com.example.memento.demo03;

/**
 * 原型管理者
 * @author hzq
 * @date 2019/7/19 13:06
 */
public class PrototypeCaretaker {

    private OriginatorPrototype originatorPrototype;

    public OriginatorPrototype getOriginatorPrototype() {
        return originatorPrototype;
    }

    public void setOriginatorPrototype(OriginatorPrototype originatorPrototype) {
        this.originatorPrototype = originatorPrototype;
    }
}
