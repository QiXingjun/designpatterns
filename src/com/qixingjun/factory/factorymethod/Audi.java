package com.qixingjun.factory.factorymethod;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class Audi implements Car{
    @Override
    public void run() {
        System.out.println("我是奥迪！");
    }
}
