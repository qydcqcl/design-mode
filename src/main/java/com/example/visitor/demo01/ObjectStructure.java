package com.example.visitor.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色
 * @author hzq
 * @date 2019/7/18 12:46
 */
public class ObjectStructure {

    private List<Element> list = new ArrayList<>();

    public void accpet(Visitor visitor){
        Iterator<Element> iterator = list.iterator();
        while(iterator.hasNext()){
            Element element = iterator.next();
            element.accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
