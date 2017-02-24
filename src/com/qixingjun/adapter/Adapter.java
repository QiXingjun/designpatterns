package com.qixingjun.adapter;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 适配器本身，相当于例子中的转接适配器
 * 类适配器，使用继承实现
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void handleRequest() {
        super.request();
    }
}
