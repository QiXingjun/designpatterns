package com.qixingjun.responsibilitychain;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description 主任类
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays() < 3) {
            System.out.println("员工：" + leaveRequest.getEmpName() + ",请假天数：" + leaveRequest.getLeaveDays() + ",请假理由：" + leaveRequest.getReason());
            System.out.println("主任：" + this.name + "，审批通过！");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
