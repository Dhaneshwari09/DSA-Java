public class maximumin2Darray {

    public static void main(String[] args) {
        
        int [][] arr = {
            {23,4,1},
            {18, 12, 3, 9},
            {78,99,34,56},
            {18,120}
        };
        System.out.println(found(arr));
    }

    public static int found(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
