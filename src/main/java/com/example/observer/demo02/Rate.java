package com.example.observer.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标类：汇率
 * @author hzq
 * @date 2019/7/15 12:36
 */
public abstract class Rate {

    protected List<Company> companies = new ArrayList<>();

    public abstract void change(int number);

    public void add(Company company){
        companies.add(company);
    }

    public void remove(Company company){
        companies.remove(company);
    }
}
