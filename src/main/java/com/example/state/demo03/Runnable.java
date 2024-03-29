package com.example.state.demo03;

/**
 * 具体状态类：就绪状态
 * @author hzq
 * @date 2019/7/10 13:19
 */
public class Runnable extends ThreadState {

    public Runnable() {
        stateName = "就绪状态";
        System.out.println("当前线程处于：就绪状态.");
    }

    public void getCPU(ThreadContext context){
        System.out.print("获得CPU时间-->");
        if(stateName.equals("就绪状态")){
            context.setState(new Running());
        }else{
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}
