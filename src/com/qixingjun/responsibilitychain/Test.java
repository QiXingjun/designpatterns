package com.qixingjun.responsibilitychain;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Leader director = new Director("张三");
        Leader manager = new Manager("李四");
        Leader generalManager = new GeneralManager("王五");

        //组织责任链的关系
        director.setNextLeader(manager);
        manager.setNextLeader(generalManager);

        //开始请假操作
        LeaveRequest leaveRequest = new LeaveRequest("王二",20,"回家娶媳妇！");
        director.handleRequest(leaveRequest);


        LeaveRequest leaveRequest2 = new LeaveRequest("王二",50,"回家娶媳妇！");
        director.handleRequest(leaveRequest2);
    }
}
