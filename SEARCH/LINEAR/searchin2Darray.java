import java.util.Arrays;

public class searchin2Darray {
    
    public static void main(String[] args) {
        
        int [][] arr = {
            {23,4,1},
            {18, 12, 3, 9},
            {78,99,34,56},
            {18,12}
        };
        int target = 90;
        int[] ans = found(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] found(int [][] arr , int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int []{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
