package com.qixingjun.decorator;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description 具体装饰器
 */
public class AiCar extends SuperCar{
    public AiCar(ICar iCar) {
        super(iCar);
    }

    public void autoMove(){
        System.out.println("自动驾驶！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
