import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12}; // Example input
        shiftZerosToEnd(arr);
        System.out.println(Arrays.toString(arr)); // Output the modified array
    }

    public static void shiftZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; // Pointer for the next non-zero element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }

    public int find(int[] arr, int n, int start, int end){
        int mid = (start + end)/2;
        if(n == arr[mid]) return arr[mid];
        if(n <= arr[start]){
            // element is in end
            if(n < arr[mid]){
                find(arr, n, mid + 1, end);
            }
            else {
                find(arr, n, start, mid);
            }
        }
        else{
            //in start
            if(n < arr[mid]){
                find(arr, n, start, mid);
            }
            else {
                find(arr, n, mid+1, end);
            }
        }
        return -1;
    }
}
