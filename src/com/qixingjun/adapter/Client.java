package com.qixingjun.adapter;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 适配器模式，例子：
 * 一个不带usb接口，只有一个ps/2接口的键盘，需要连接电脑，所以此时需要一个适配器来完成转接
 */
public class Client {
    public void test1(Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        // 类适配器的方式
        Client client = new Client();
        Target target = new Adapter();
        client.test1(target);


        //对象适配器的方式
        Adaptee adaptee = new Adaptee();
        Target target2 = new Adapter2(adaptee);
        client.test1(target2);
    }
}
