package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class BadTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("磨损快！");
    }
}
