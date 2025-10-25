//approach 1
class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        Stack<Integer> aux = new Stack<>();
        
        while(!st.isEmpty()){
            aux.push(st.pop());
        }
        st.addAll(aux);
    }
}

//approach 2 using recursion
import java.util.Stack;

class Solution {
    // Helper function to insert element at the bottom of stack
    public static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    // Main recursive function to reverse stack
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverseStack(st);

        System.out.println(st);  // Output: [1, 2, 3] → [3, 2, 1]
    }
}


//custom stack reverse
import java.util.*;

import org.w3c.dom.Node;
public class Reverse {

     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // Push operation
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop operation
        public static int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek operation
        public static int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    public static void insertBottom(Stack s ,int data){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        insertBottom(s,data);
        s.push(top);
    }
    public static void reverse(Stack s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverse(s);
        insertBottom(s,top);

    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        Node temp = s.head;

        while(temp!=null){
            System.out.println(temp.data +" ");
            temp = temp.next;

        }
        reverse(s);
        temp = s.head;
       System.out.println("the reversed stack is ");
        while(temp!=null){
            System.out.println(temp.data +" ");
            temp = temp.next;

        }
        
    }
}


