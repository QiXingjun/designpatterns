package com.qixingjun.command;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/25
 * @Description 命令的调用者/发起者
 */
public class Invoke {
    //这里可以是一个命令，也可以通过List<Command>容纳多个命令，进行批处理
    //数据库底层的事务管理就是类似的结构！
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    //业务方法，用于调用命令类的方法
    public void call(){
        command.execute();
    }
}
