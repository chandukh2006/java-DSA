public class Insert {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};

        insertion(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertion(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }
}
