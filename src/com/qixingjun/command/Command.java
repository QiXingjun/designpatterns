package com.qixingjun.command;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public interface Command {
    /**
     * 这是一个返回结果为空的方法，
     * 在实际的应用中，可以根据需求设计多个不同的方法。
     */
    void execute();
}
