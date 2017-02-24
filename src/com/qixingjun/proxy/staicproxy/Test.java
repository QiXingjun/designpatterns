package com.qixingjun.proxy.staicproxy;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.collectMoney();
    }
}
