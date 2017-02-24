package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 具体装饰器
 */
public class FlyCar extends SuperCar{
    public FlyCar(ICar iCar) {
        super(iCar);
    }

    public void fly(){
        System.out.println("天上飞！");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
