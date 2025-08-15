import java.util.*;
public class Main{
    public static void main(String[] args) {
        int arr[] = {1,5,6,4,8,3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int arr[]){
        int flag;
        for(int i=0;i<arr.length-1;i++){
      flag = 0;
        for(int j =0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]= temp;
                flag=1;
            }


        }
        if(flag==0) break;
        }
    }
}
