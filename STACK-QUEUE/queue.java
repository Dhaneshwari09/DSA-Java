import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        //-give top element
        System.out.println(q.peek());
        // remove from start to end
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.remove());

    }
}