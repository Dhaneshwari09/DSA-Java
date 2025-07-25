import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class dequeue {
    
    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        deque.add(40);
        
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.remove());

    }
}
