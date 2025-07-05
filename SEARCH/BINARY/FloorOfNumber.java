public class FloorOfNumber {
    
     public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 6, 7 };
        int target = 5;
        int ans = floor(arr, target);
        System.out.println(ans); 

    }

    // return the index : greatest number <= target
    public static int floor(int[] arr, int target) {

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

        return high; // This is the index of the ceiling
    }
}
