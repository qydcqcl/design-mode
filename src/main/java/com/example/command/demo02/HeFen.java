package com.example.command.demo02;

/**
 * 具体命令类：河粉
 * @author hzq
 * @date 2019/7/6 13:11
 */
public class HeFen implements Breakfast {

    private HeFenChef heFenChef;

    public HeFen() {
        heFenChef = new HeFenChef();
    }

    @Override
    public void cooking() {
        heFenChef.cooking();
    }
}
