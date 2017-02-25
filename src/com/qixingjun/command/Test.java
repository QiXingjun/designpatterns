package com.qixingjun.command;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Receiver());
        Invoke invoke = new Invoke(command);
        invoke.call();
    }
}
