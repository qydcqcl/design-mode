package com.example.visitor.demo02;

/**
 * 具体元素：铜
 * @author hzq
 * @date 2019/7/18 12:56
 */
public class Cuprum implements Material {

    @Override
    public String accpet(Company company) {
        return company.create(this);
    }
}
