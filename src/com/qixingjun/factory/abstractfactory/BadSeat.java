package com.qixingjun.factory.abstractfactory;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description
 */
public class BadSeat implements Seat {
    @Override
    public void message() {
        System.out.println("不可以按摩！");
    }
}
