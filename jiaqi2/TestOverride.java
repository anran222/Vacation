package jiaqi2;

/**
 * @Author:xiang
 * @Date:2020/2/3 12:04
 */
public class TestOverride {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Horse();
        Vehicle v3 = new Plane();
        v1.run();
        v2.run();
        v3.run();
        v2.stop();
        v3.stop();
    }
}
class Vehicle{
    public void run(){
        System.out.println("跑");
    }
    public void stop(){
        System.out.println("停止");
    }
}
class Horse extends Vehicle{
    @Override
    public void run() {
        System.out.println("快跑");
    }
}
class Plane extends Vehicle{
    @Override
    public void run() {
        System.out.println("天上飞");
    }

    @Override
    public void stop() {
        System.out.println("坠毁了");
    }
}
