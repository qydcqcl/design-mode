package com.example.command.demo02;

/**
 * 具体命令类：混沌
 * @author hzq
 * @date 2019/7/6 13:11
 */
public class HunTun implements Breakfast {

    private HunTunChef hunTunChef;

    public HunTun() {
        hunTunChef = new HunTunChef();
    }

    @Override
    public void cooking() {
        hunTunChef.cooking();
    }
}
