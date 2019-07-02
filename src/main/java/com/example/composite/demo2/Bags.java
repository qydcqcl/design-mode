package com.example.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzq
 * @date 2019/7/2 13:13
 */
public class Bags implements Articles {

    /**
     * 名字
     */
    private String name;

    private List<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles articles){
        bags.add(articles);
    }

    public void remove(Articles articles){
        bags.remove(articles);
    }

    public Articles getChile(int i){
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for(Articles articles : bags){
            s += articles.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for(Articles articles : bags){
            articles.show();
        }
    }
}
