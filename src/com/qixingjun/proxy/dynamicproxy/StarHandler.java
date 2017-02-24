package com.qixingjun.proxy.dynamicproxy;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class StarHandler implements InvocationHandler {

    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /**
     * 这个方法是核心方法，在这儿做统一的流程控制
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //可以在这个方法做统一的流程控制
        Object object = null;

        System.out.println("真正的方法执行之前...");
        System.out.println("跟我的经纪人去洽谈");

        if (method.getName().equals("sing")){
            object = method.invoke(realStar,args);
        }

        System.out.println("真正的方法执行之后...");
        System.out.println("把尾款给我的经纪人");
        return object;
    }
}
