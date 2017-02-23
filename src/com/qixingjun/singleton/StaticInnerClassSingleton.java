package com.qixingjun.singleton;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/23
 * @Description 静态内部类单例模式
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){
    }
    public static class SingletonInstance{
        public static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return SingletonInstance.instance;
    }
}
