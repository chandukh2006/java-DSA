import java.util.*;
public class Recursion{
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,45,5};
        linear(arr,45,0);
        System.out.println(a);
    }
    static ArrayList<Integer> a = new ArrayList<>();
    static void linear(int arr[],int target,int index){
        
        if(index==arr.length){
            return ;
        }
            if(arr[index]==target) {
                a.add(index); }
         
               linear(arr,target,index+1);
            
    }
}
