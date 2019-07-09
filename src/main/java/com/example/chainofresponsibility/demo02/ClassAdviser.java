package com.example.chainofresponsibility.demo02;

/**
 * 具体处理者1：班主任类
 * @author hzq
 * @date 2019/7/9 12:58
 */
public class ClassAdviser extends Leader {

    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= 2){
            System.out.println("班主任批准您请假" + leaveDays + "天。");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
