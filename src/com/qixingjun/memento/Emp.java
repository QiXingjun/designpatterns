package com.qixingjun.memento;

/**
 * @Author XingJun Qi
 * @MyBlog www.qixingjun.tech
 * @Version 1.0.0
 * @Date 2017/2/27
 * @Description 源发器类
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    //进行备忘操作，并返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    //进行数据恢复，恢复成指定备忘录的值
    public void recovery(EmpMemento empMemento){
        this.ename = empMemento.getEname();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
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
