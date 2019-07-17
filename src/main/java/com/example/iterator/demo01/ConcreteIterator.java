package com.example.iterator.demo01;

import java.util.List;

/**
 * @author hzq
 * @date 2019/7/17 12:33
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list = null;

    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object o = list.get(index);
        return o;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size() - 1){
            return true;
        }else{
            return false;
        }
    }
}
