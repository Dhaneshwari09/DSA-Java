import java.util.Arrays;

public class searchinstring {

    public static void main(String[] args) {

        String value = "rakhi";
        char target = 'a';
        System.out.println(Arrays.toString(value.toCharArray()));
        System.out.println(found(value, target));
    }

    public static boolean found(String value, char target) {
        for (char ch : value.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
