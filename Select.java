public class Select {
    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 1};
        int n = arr.length;

        
        sel(arr, n);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    
    }

    public static void sel(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] >arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
    }
}
