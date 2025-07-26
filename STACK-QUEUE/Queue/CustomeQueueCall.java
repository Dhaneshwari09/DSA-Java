package Queue;

public class CustomeQueueCall {
    
    public static void main(String[] args)  throws Exception{
        
        CustomeQueue queue = new CustomeQueue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //-give top element
        System.out.println(queue.peek());
        // remove from start to end
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
