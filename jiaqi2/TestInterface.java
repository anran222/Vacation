package jiaqi2;

/**
 * @Author:xiang
 * @Date:2020/2/3 20:19
 * 接口的使用
 */
public class TestInterface {
    public static void main(String[] args) {
        Volant volant=new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HEIGHT);
        Honest honest=new GoodMan();
        honest.helpOther();
    }
}
interface Volant{
    int FLY_HEIGHT=100;
    void fly();
}
interface Honest{
    void helpOther();
}
class Angel implements Volant,Honest{
    @Override
    public void fly() {
        System.out.println("飞翔");
    }

    @Override
    public void helpOther() {
        System.out.println("帮助别人");
    }
}
class GoodMan implements Honest{
    @Override
    public void helpOther() {
        System.out.println("帮助别人");
    }
}
class BirdMan implements Volant{
    @Override
    public void fly() {
        System.out.println("我是飞人");
    }
}
