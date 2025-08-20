public class Reverse {
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        printSubarraySums(arr);
    }

    public static void printSubarraySums(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int cursum = 0;
      
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    cursum +=arr[k];
             
                }
                System.out.println("cursum is "+cursum);
                         System.out.println();
                if(max<cursum){
                    max = cursum;
                }

           
            }
            System.out.println();
      
        }System.out.println("maximum subarray sum is = "+max);

    }
}
