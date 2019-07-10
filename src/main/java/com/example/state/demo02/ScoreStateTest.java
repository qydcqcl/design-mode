package com.example.state.demo02;

/**
 * @author hzq
 * @date 2019/7/10 13:07
 */
public class ScoreStateTest {

    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        context.add(30);
        context.add(40);
        context.add(25);
        context.add(-15);
        context.add(-25);
    }
}
