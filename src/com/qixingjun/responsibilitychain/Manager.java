package com.qixingjun.responsibilitychain;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description 经理类
 */
public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 10) {
            System.out.println("员工：" + leaveRequest.getEmpName() + ",请假天数：" + leaveRequest.getLeaveDays() + ",请假理由：" + leaveRequest.getReason());
            System.out.println("经理：" + this.name + "，审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
