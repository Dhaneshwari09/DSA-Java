import java.util.Arrays;

public class Swapar {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Swapar obj = new Swapar();      
        obj.swap(arr, 0, 4);          
        obj.swap(arr, 1, 3);     
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
