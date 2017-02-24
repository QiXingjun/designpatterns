package com.qixingjun.facade;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class ChinaBank implements Bank {
    @Override
    public void openAccount() {
        System.out.println("在中国银行开户！");
    }
}
