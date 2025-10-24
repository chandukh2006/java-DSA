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


