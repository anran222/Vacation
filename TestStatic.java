package jiaqi;

public class TestStatic {
    int id;
    String name;
    String pws;
    static String company="学校";
    public TestStatic(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void login(){
        System.out.println("登录："+name);
    }
    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        TestStatic u=new TestStatic(101,"张三");
        TestStatic.printCompany();
        TestStatic.company="阿里";
        TestStatic.printCompany();
    }
}
