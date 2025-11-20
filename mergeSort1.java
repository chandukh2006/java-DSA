import java.util.Arrays;

public class a{
    public static void main(String[] args) {
        int arr[] = {8,2,0,1,3,5,7};
        int n = arr.length-1;
        mergesort(arr,0,n);
        //print array
       
            System.out.print(Arrays.toString(arr) +" " );
        
        System.out.println();
    }
    public static void mergesort(int arr[],int start,int end){
            if(start>=end){
                return ;
            }
        
        int mid = start+(end-start)/2;
        //left tree
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merge(arr,start,mid,end);

    }
    public static void merge(int arr[],int start,int mid,int end){
        int i = start;
        int j = mid+1;
        int k =0;
        int temp[] = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]>=arr[j]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        //for left remianing  part
        while(i<= mid){
            temp[k++] = arr[i++];
        }

        //for remaining right part
        while(j<=end){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(int p =0;p<temp.length;p++){
            arr[start+p]= temp[p];
        }
    }
}
