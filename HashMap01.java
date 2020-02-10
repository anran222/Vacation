package jiaqi5;

import java.util.Arrays;

/**
 * @Author:xiang
 * @Date:2020/2/10 15:04
 * 自定义一个HashMap
 */
public class HashMap01 {
    Node[] table;
    int size;

    public HashMap01() {
        table=new Node[16];
    }

    public Object get(Object key){
        int hash=myHash(key.hashCode(),table.length);
        Object value=null;
        if (table[hash]!=null){
            Node temp=table[hash];
            while(temp!=null){
                if (temp.key.equals(key)){
                    value=temp.value;
                    break;
                }else {
                    temp=temp.next;
                }
            }
        }
        return value;
    }

    public void put(Object key,Object value){
        Node newNode=new Node();
        newNode.hash=myHash(key.hashCode(),table.length);
        newNode.key=key;
        newNode.value=value;
        newNode.next=null;
        Node temp=table[newNode.hash];
        Node iteLast=null;
        boolean keyRepeat=false;
        if (temp==null){
            table[newNode.hash]=newNode;
            size++;
        }else {
            while (temp != null) {
                if (temp.key.equals(key)) {
                    keyRepeat=true;
                    temp.value = value;
                    break;
                } else {
                    iteLast = temp;
                    temp = temp.next;
                }
            }
            if (!keyRepeat) {
                iteLast.next = newNode;
                size++;
            }
        }
    }

    @Override
    public String toString() {
      StringBuilder sb=new StringBuilder("{");
        for (int i = 0; i <table.length ; i++) {
            Node temp=table[i];
            while (temp!=null){
                sb.append(temp.key+":"+temp.value+",");
                temp=temp.next;
            }
        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public static int myHash(int v, int length){
        return v&(length-1);
    }

    public static void main(String[] args) {
        HashMap01 m=new HashMap01();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
//        for (int i = 10; i <=100 ; i++) {
//            System.out.println(i+"-------"+myHash(i,16));
//        }
    }
}
class Node{
    int hash;
    Object key;
    Object value;
    Node next;
}
