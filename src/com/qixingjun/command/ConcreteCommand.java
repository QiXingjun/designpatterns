package com.qixingjun.command;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;      //命令的真正执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令的执行之前或者之后可以执行其他操作
        receiver.action();
    }
}
