package jiaqi2;

/**
 * @Author:xiang
 * @Date:2020/2/3 11:26
 */
public class TestExends {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="张三";
        stu.height=180;
        stu.major="软件工程";
        stu.study();
        stu.rest();

        Student stu2=new Student("李四",175,"网络工程");
        stu2.study();
        stu2.rest();
    }
}
class person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息");
    }
}
class Student extends person{
    String major;
    public void study(){
        System.out.println("学习");
    }

    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }
    public Student(){
    }
}
