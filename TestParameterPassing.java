package jiaqi;

public class TestParameterPassing {
    int id;
    String name;
    String pwd;
    public TestParameterPassing(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void testParameterPassing1(TestParameterPassing u){
        u.name="张三";
    }

    public static void main(String[] args) {
        TestParameterPassing u1=new TestParameterPassing(100,"李四");
        u1.testParameterPassing1(u1);
        System.out.println(u1.name);
    }
}
