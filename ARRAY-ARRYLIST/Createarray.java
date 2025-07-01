import java.util.Arrays;
import java.util.Scanner;

public class Createarray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = { 12, 33, 4 };
        
        // for-each loop
        for (int arr1 : arr) {
            System.out.println(arr1);
            
        }
        System.out.println(Arrays.toString(arr));

        // taking input from user
        // int [] arr1 = new int[3];
        // for(int i=0; i<3; i++){
        // arr1[i] = in.nextInt();
        // }
    }
}