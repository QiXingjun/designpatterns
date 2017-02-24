package com.qixingjun.adapter;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 适配器本身，相当于例子中的转接适配器
 * 对象适配器：采用组合实现
 */
public class Adapter2 implements Target {

    Adaptee adaptee = new Adaptee();

    @Override
    public void handleRequest() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
