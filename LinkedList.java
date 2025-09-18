import java.util.*;
public class LinkedList{
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
      
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size ++;
    }
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+">");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
         list.addFirst(30);
         list.printList();

    }
}
