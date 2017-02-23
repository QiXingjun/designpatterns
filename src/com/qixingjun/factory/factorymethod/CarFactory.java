package com.qixingjun.factory.factorymethod;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 工厂方法相对于简单工厂的好处是：对修改关闭，对扩展开放，即满足了“开闭原则”
 * 弊端：代码量多了
 */
public interface CarFactory {
    Car createCar();
}
