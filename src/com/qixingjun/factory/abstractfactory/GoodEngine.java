package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class GoodEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转得快！");
    }

    @Override
    public void start() {
        System.out.println("启动快！");
    }
}
