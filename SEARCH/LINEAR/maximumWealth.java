public class maximumWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                { 1, 2, 3 },
                { 9, 1, 6 },
                { 3, 3, 7 }
        };

        System.out.println(maximum(accounts));
    }

    public static int maximum(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
