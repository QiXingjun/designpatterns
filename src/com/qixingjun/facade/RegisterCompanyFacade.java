package com.qixingjun.facade;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/24
 * @Description
 */
public class RegisterCompanyFacade {
    void registerCompany(){
        ChinaBank chinaBank = new ChinaBank();
        chinaBank.openAccount();
        ChinaTax chinaTax = new ChinaTax();
        chinaTax.payTax();
    }
}
