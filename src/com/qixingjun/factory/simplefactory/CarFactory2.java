package com.qixingjun.factory.simplefactory;

import com.qixingjun.factory.factorymethod.Audi;
import com.qixingjun.factory.factorymethod.Bmw;
import com.qixingjun.factory.factorymethod.Car;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description Car的简单工厂，有个缺点：违反“开闭原则”
 */
public class CarFactory2 {
    public static Car createAudi(){
        return new Audi();
    }

    public static Car createBmw(){
        return new Bmw();
    }
}
