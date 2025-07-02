public class findevendigit {
    
    public static void main(String[] args) {
        
        int arr [] ={12,345,2,6,7896};
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if((countDigits(arr[i]) % 2) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int countDigits(int num){
           int digit = 0;
           while(num > 0){
              digit++;
              num = num / 10;
           }
           return digit;
    }
}
