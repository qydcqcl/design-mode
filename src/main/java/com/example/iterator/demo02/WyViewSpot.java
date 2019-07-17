package com.example.iterator.demo02;

/**
 * 婺源景点类
 * @author hzq
 * @date 2019/7/17 12:46
 */
public class WyViewSpot {

    private String name;
    private String introduce;

    public WyViewSpot(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
