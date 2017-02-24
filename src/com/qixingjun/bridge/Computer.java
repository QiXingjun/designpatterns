package com.qixingjun.bridge;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Computer {

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}
