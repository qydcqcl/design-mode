package com.example.visitor.demo02;

/**
 * 具体访问者：艺术公司
 * @author hzq
 * @date 2019/7/18 12:54
 */
public class ArtCompany implements Company {

    @Override
    public String create(Paper paper) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum cuprum) {
        return "朱熹铜像";
    }
}
