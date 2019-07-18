package com.example.visitor.demo02;

/**
 * 抽象访问者:公司
 * @author hzq
 * @date 2019/7/18 12:53
 */
public interface Company {

    String create(Paper paper);
    String create(Cuprum cuprum);
}
