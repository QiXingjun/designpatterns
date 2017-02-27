package com.qixingjun.memento;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/27
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("QiXiaoBai",18,100000);
        System.out.println("第一次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        careTaker.setEmpMemento(emp.memento());     //备忘一次

        emp.setAge(20);
        emp.setEname("QiXiaoHei");
        emp.setSalary(200000);

        System.out.println("第二次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());

        emp.recovery(careTaker.getEmpMemento());    //恢复到备忘录对象保存的状态
        System.out.println("第三次创建对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
    }
}
