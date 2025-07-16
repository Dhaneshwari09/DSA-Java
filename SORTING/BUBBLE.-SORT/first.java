import java.util.Arrays;

public class first {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 5, 6, 0, -1 };
        // int[] arr = {1,2,3,4,5,6};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubblesort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if arr is sort then does not need to swap
            if (swapped == false) {
                break;
            }
           // System.out.println(swapped);
        }
    }
}
