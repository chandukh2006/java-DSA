import java.util.*;
public class Main {

    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        int key =8;
        int ans = binary(arr, key);

        System.out.println(ans);
        
    }
    public static int binary(int arr[], int key){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
             if(arr[mid]<key){
                start=mid+1;
             }
             else{
                end = mid-1;
             }
        }
        return -1;

    }
}
