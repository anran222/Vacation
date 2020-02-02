package jiaqi;

public class SxtStu {
    int id;
    String name;
    int age;

    Computer comp;

    void study(){
        System.out.println("我在认真学习,使用的电脑是"+comp.name);

    }
    void play(){
        System.out.println("我在玩游戏");
    }

    public static void main(String[] args) {
        SxtStu stu=new SxtStu();
        stu.id=001;
        stu.name="张三";
        stu.age=18;
        stu.play();
        Computer c1=new Computer();
        c1.name="联想";
        stu.comp=c1;
        stu.study();
    }
}

class Computer{
    String name;
}