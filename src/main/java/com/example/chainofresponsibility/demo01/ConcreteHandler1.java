package com.example.chainofresponsibility.demo01;

/**
 * 具体的处理者角色1
 * @author hzq
 * @date 2019/7/9 12:47
 */
public class ConcreteHandler1 extends Handler{

    @Override
    public void handleRequest(String request) {

        if("1".equals(request)){
            System.out.println("具体处理者1负责处理该请求");
        }else{
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有人处理该请求");
            }
        }
    }
}
