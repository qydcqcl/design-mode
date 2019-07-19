package com.example.memento.demo02;

/**
 * 管理者：美女栈
 * @author hzq
 * @date 2019/7/19 12:47
 */
public class GirlStack {

    private Girl[] girls;

    private int top;

    public GirlStack() {
        girls = new Girl[5];
        top = -1;
    }

    public boolean push(Girl girl){
        if(top >= 4){
            System.out.println("你太花心了，变来变去的");
            return false;
        }else{
            girls[++top] = girl;
            return true;
        }
    }

    public Girl pop(){
        if(top < 0){
            System.out.println("美女栈空了");
            return girls[0];
        }else{
            return girls[--top];
        }
    }
}
