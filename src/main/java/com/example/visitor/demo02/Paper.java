package com.example.visitor.demo02;

/**
 * 具体元素：纸
 * @author hzq
 * @date 2019/7/18 12:55
 */
public class Paper implements Material {

    @Override
    public String accpet(Company company) {
        return company.create(this);
    }
}
