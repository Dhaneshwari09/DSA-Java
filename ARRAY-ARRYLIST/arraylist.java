import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    
    public static void main(String[] args) {
        
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(23);
        // list.add(45);
        // list.add(45);
        // list.add(45);
        // list.add(45);

        // System.out.println(list);

        //taking input
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<3; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
