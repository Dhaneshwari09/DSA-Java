public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 6, 7 };
        int target = 5;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }

    // return the index : smallest number >= target
    public static int ceiling(int[] arr, int target) {

        // but what if target is greater than the largest element in the array? 
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}
