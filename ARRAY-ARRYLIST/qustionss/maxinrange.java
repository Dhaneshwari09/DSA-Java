public class maxinrange {
    
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4, 5,50};

        System.out.println(max(arr, 1,3));
    }
    public static int max(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start; i<end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
