package com.example.visitor.demo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构角色:材料集
 * @author hzq
 * @date 2019/7/18 12:56
 */
public class SetMaterial {

    private List<Material> list = new ArrayList<>();

    public String accpet(Company company){
        String temp = "";
        Iterator<Material> iterator = list.iterator();
        while(iterator.hasNext()){
            Material material = iterator.next();
            temp += material.accpet(company) + " ";
        }
        return temp;
    }

    public void add(Material material){
        list.add(material);
    }

    public void remove(Material material){
        list.remove(material);
    }

}
