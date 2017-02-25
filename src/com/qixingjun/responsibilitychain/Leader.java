package com.qixingjun.responsibilitychain;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;    //责任链上的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 处理请假请求的核心业务方法
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
