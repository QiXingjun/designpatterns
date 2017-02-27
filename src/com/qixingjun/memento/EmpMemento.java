package com.qixingjun.memento;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/27
 * @Description 备忘录类
 */
public class EmpMemento {

    private String ename;
    private int age;
    private double salary;

    public EmpMemento(Emp emp) {
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
