package jiaqi5;

import java.util.HashMap;

/**
 * @Author:xiang
 * @Date:2020/2/10 14:02
 * 测试HashMap类
 */
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");
        System.out.println(m1.get(1));
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("four"));

        HashMap<Integer,String> m2=new HashMap<>();
        m2.put(4,"four");
        m2.put(5,"five");
        m1.putAll(m2);
        System.out.println(m1);
    }
}
