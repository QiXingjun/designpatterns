package com.qixingjun.singleton;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/22
 * @Description 单例模式
 * 适用场景：有些对象一个就够了
 * 作用：保证整个应用程序中某个实例只有一个
 * 类型：饥汉模式，懒汉模式,静态内部类，枚举单例
 * 饿汉模式线程安全，调用效率高，资源利用率低，不可以延时加载
 * 懒汉模式线程安全，调用效率低，资源利用率高，可以延时加载
 * 静态内部类线程安全，调用效率高，资源利用率高，可以延时加载
 * 枚举单例线程安全，调用效率高，资源利用率高，不可以延时加载
 */
public class HungrySingleton {
    //1.将构造方法私有化，不允许外部直接创建对象
    private HungrySingleton(){

    }

    //2.创建类的唯一实例,使用private static修饰
    private static HungrySingleton instance = new HungrySingleton();

    //3.提供一个获取实例的方法，使用public static修饰
    public static HungrySingleton getInstance(){
        return instance;
    }
}
