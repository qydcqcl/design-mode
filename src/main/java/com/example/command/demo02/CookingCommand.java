package com.example.command.demo02;

/**
 * @author hzq
 * @date 2019/7/6 13:18
 */
public class CookingCommand {

    public static void main(String[] args) {
        Breakfast food1 = new ChangFen();
        Breakfast food2 = new HunTun();
        Breakfast food3 = new HeFen();
        Waiter fwy = new Waiter();
        //设置肠粉菜单
        fwy.setChangFen(food1);
        //设置河粉菜单
        fwy.setHunTun(food2);
        //设置馄饨菜单
        fwy.setHeFen(food3);
        //选择肠粉
        fwy.chooseChangFen();
        //选择河粉
        fwy.chooseHeFen();
        //选择馄饨
        fwy.chooseHunTun();
    }
}
