public class Reverse {
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        printSubarraySums(arr);
    }

    public static void printSubarraySums(int arr[]) {
        int ts = 0;  // total subarrays counter

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;  // sum of current subarray

                // Print subarray and calculate sum
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                System.out.println("=> Sum: " + sum);
                ts++;
            }
            System.out.println();
        }

        System.out.println("Total number of subarrays: " + ts);
    }
}
