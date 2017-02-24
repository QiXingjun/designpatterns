package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 具体装饰器
 */
public class WaterCar extends SuperCar{
    public WaterCar(ICar iCar) {
        super(iCar);
    }

    public void swim(){
        System.out.println("水上漂！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
