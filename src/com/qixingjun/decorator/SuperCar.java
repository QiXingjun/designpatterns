package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 装饰器
 */
public class SuperCar implements ICar {
    protected ICar iCar;

    public SuperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}
