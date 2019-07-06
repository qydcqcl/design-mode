package com.example.command.demo02;

/**
 * 具体命令类：肠粉
 * @author hzq
 * @date 2019/7/6 13:10
 */
public class ChangFen implements Breakfast {

    private ChangFenChef changFenChef;

    public ChangFen() {
        changFenChef = new ChangFenChef();
    }

    @Override
    public void cooking() {
        changFenChef.cooking();
    }
}
