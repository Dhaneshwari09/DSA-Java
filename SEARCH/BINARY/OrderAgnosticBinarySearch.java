public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        //Test Case 1: Ascending order array
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int target = 2;

        // Test Case 2: Descending order array
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        int target = 6;
        int ans = searchindex(arr, target);
        System.out.println(ans);

    }

    public static int searchindex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isAscending) {
                if (target > arr[mid]) {
                    left = mid + 1;
                } else if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target < arr[mid]) {
                    left = mid + 1;
                } else if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
