package com.example.visitor.demo02;

/**
 * 具体访问者：造币公司
 * @author hzq
 * @date 2019/7/18 12:54
 */
public class Mint implements Company {

    @Override
    public String create(Paper paper) {
        return "纸币";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "铜币";
    }
}
