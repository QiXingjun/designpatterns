package com.qixingjun.responsibilitychain;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description 总经理类
 */
public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 30) {
            System.out.println("员工：" + leaveRequest.getEmpName() + ",请假天数：" + leaveRequest.getLeaveDays() + ",请假理由：" + leaveRequest.getReason());
            System.out.println("总经理：" + this.name + "，审批通过！");
        } else {
            System.out.println("你是想辞职么？请直说！竟然请假："+leaveRequest.getLeaveDays()+"天！");
        }
    }
}
