package jiaqi2;

/**
 * @Author:xiang
 * @Date:2020/2/3 16:05
 * 测试多态
 */
public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a=new Animal();
        animalCry(a);
        Dog d=new Dog();
        animalCry(d);
        d.seeDoor();
    }

    static void animalCry(Animal a){
        a.shout();
    }
}
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门中");
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}


