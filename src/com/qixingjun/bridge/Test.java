package com.qixingjun.bridge;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //假设销售联想的笔记本
        Computer lenovoLaptop = new Laptop(new Lenovo());
        lenovoLaptop.sale();

        //假设销售戴尔的台式机
        Computer dellDesktop = new Desktop(new Dell());
        dellDesktop.sale();
    }
}
