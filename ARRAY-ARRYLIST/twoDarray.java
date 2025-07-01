import java.util.Arrays;
import java.util.Scanner;


public class twoDarray {
    
    public static void main(String[] args) {
        
        // int[][] arr = new int[3][];
        
        //--- first way
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //----second way
        int[][] arr1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        for(int i=0; i<arr1.length; i++){     
            System.out.println(Arrays.toString(arr1[i]));
        }

        //-----------teaking input from user
        Scanner sc = new Scanner(System.in);
        int[][] arr3 = new int[3][3]; // 3 rows, 3 columns

        // Input section
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = sc.nextInt();
            }
        }

        //Output section
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
