package linkedlist;

/**
 * @Author:xiang
 * @Date:2020/2/6 13:31
 * 双向链表的实现
 */
class Node{
     Node previous;
     Node next;
     Object element;
    public Node(Node previous,Node next,Object element){
        super();
        this.previous=previous;
        this.next=next;
        this.element=element;
    }
    public Node(Object element){
        super();
        this.element=element;
    }
}

public class LinkedList01 {
    private Node first;
    private Node last;
    private int size;

    public Object get(int index) {
        if (index > (size - 1) || index < 0) {
            throw new RuntimeException();
        }
        Node temp=getNode(index);
        return temp!=null?temp.element:null;
    }
    public Node getNode(int index){
        Node temp = first;
        if (index <= (size >> 1)) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp=last;
            for (int i = size - 1; i >= index; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }
    public void add(Object obj){
        Node node=new Node(obj);
        if (first==null){
            first=node;
            last=node;
        }else{
            node.previous=last;
            node.next=null;
            last.next=node;
            last=node;
        }
        size++;
    }
    public void remove(int index){
        Node temp=getNode(index);
        if (temp!=null){
            Node up=temp.previous;
            Node down=temp.next;
            if (up!=null) {
                up.next = down;
            }
            if (down!=null) {
                down.previous = up;
            }
            if (index==0){
                first=down;
            }
            if (index==size-1){
                last=up;
            }
            size--;

        }
    }
    public void insert(int index,Object obj){
        Node newNode=new Node(obj);
        Node temp=getNode(index);
        if (temp!=null) {
            Node up = temp.previous;
            up.next = newNode;
            newNode.previous = up;
            newNode.next=temp;
            temp.previous=newNode;
        }
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        Node temp=first;
        while(temp!=null){
            sb.append(temp.element+",");
            temp=temp.next;
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList01 ls=new LinkedList01();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        System.out.println(ls);
        System.out.println(ls.get(1));
        ls.remove(0);
        System.out.println(ls);
        ls.insert(3,"z");
        System.out.println(ls);
    }
}
