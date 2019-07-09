package com.example.chainofresponsibility.demo02;

/**
 * @author hzq
 * @date 2019/7/9 12:56
 */
public class LeaveApprovalTest {

    public static void main(String[] args) {
        //组装责任链
        Leader leader1 = new ClassAdviser();
        Leader leader2 = new DepartmentHead();
        Leader leader3 = new Dean();
        Leader leader4 = new DeanOfStudies();

        leader1.setNext(leader2);
        leader2.setNext(leader3);
        leader3.setNext(leader4);

        leader1.handleRequest(1);

    }
}
