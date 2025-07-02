public class first {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int target = 7;
        int ans = searchindex(arr, target);
        System.out.println(ans);
    }

    public static int searchindex(int[] arr , int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(target > arr[mid]){
                left = mid + 1;
            }else if(target < arr[mid]){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}