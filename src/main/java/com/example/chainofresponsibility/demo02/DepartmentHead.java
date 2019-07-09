package com.example.chainofresponsibility.demo02;

/**
 * 具体处理者2：系主任类
 * @author hzq
 * @date 2019/7/9 13:00
 */
public class DepartmentHead extends Leader {

    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= 7){
            System.out.println("系主任批准您请假" + leaveDays + "天。");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
