package jiaqi2;

/**
 * @Author:xiang
 * @Date:2020/2/3 15:28
 * 测试封装
 */
public class TestEncapsulation {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if(age>=0&&age<=120){
            this.age=age;
        }
        else{
            System.out.println("请输入正确的年龄!");
        }
    }

    public int getAge(){
        return  this.age;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
