package com.example.state.demo03;

/**
 * 具体状态类：阻塞状态
 * @author hzq
 * @date 2019/7/10 13:24
 */
public class Blocked extends ThreadState {

    public Blocked() {
        stateName = "阻塞状态";
        System.out.println("当前线程处于：阻塞状态.");
    }

    public void resume(ThreadContext context){
        System.out.print("调用resume()方法-->");
        if(stateName.equals("阻塞状态")){
            context.setState(new Runnable());
        }else{
            System.out.println("当前线程不是阻塞状态，不能调用resume()方法.");
        }


    }
}
