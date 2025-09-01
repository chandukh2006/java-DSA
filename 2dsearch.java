import java.util.*;
public class arr{
    public static void main(String[] args) {
        int [][]arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int key = 6;
    elem(arr,key);

    }
    public static boolean elem(int [][]arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    System.out.println("found at cell("+i +","+j+")");
                       return true;
                }
             
            }
        }
        System.out.println("elemnt not found");
        return false;
        
    }
}
