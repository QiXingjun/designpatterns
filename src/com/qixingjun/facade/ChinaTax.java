package com.qixingjun.facade;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class ChinaTax implements Tax {
    @Override
    public void payTax() {
        System.out.println("在国税局纳税");
    }
}
