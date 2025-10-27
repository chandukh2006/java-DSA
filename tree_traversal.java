import java.util.*;
public class Main {
    
    public static class Node{
        int data ;
        Node left ;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Tree{
        static int idx = -1;
        public static Node preorder(int nodes[]){
            idx ++;
            if(nodes[idx]==-1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = preorder(nodes);
            
            newNode.right = preorder(nodes);
            return newNode;
        }

        //preeorderprint
        public static void preorderprint(Node root){
            if(root==null) return ;
            System.out.print(root.data+" ");
            preorderprint(root.left);
            preorderprint(root.right);
        }
        //levelorder
        public static void levelorder(Node root){
            if(root==null) return ;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curNode = q.poll();
                System.out.print(curNode.data+"->");
                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                 if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
     }
     public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Node root = Tree.preorder(nodes);
        System.out.println("preorder:");
        Tree.preorderprint(root);
        System.out.println();
              System.out.println("level order:");
        Tree.levelorder(root);
    }
}
