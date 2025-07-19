import java.util.Arrays;

public class first {
    
    public static void main(String[] args) {
        
        int [] arr = {2,4,1,5,6,0};
        slectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void slectionsort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int lastindex = arr.length-i-1;
            int maxindex = getmaxindex(arr, 0, lastindex);
            swap(arr, maxindex, lastindex);
        }
    }

    public static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getmaxindex(int[] arr , int start, int end){
        int max = start;
        for(int i=0; i<=end; i++){
                if(arr[start] < arr[i]){
                    max = i;
                }
        }
        return max;

    }
}
