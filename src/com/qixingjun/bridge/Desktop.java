package com.qixingjun.bridge;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale(){
        super.sale();
        System.out.println("销售台式机！");
    }
}
