package jiaqi5;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:xiang
 * @Date:2020/2/10 14:14
 * 测试map类
 */
public class TestMap {
    public static void main(String[] args) {
        Employee e1=new Employee(01,"小于",10000);
        Employee e2=new Employee(02,"小张",20000);
        Employee e3=new Employee(03,"小网",30000);

        Map<Integer,Employee> map=new HashMap<>();
        map.put(01,e1);
        map.put(02,e2);
        map.put(03,e3);
        Employee emp=map.get(01);
        System.out.println(emp.getSanme());
    }
}
class Employee{
    private int id;
    private String sanme;
    private double salary;

    public Employee(int id,String sname,double salary){
        super();
        this.id=id;
        this.sanme=sname;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSanme() {
        return sanme;
    }

    public void setSanme(String sanme) {
        this.sanme = sanme;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
