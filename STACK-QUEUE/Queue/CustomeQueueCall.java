package Queue;

public class CustomeQueueCall {
    
    public static void main(String[] args)  throws Exception{
        
        //CustomeQueue queue = new CustomeQueue(5);
        //CircularCustomeQueue queue = new CircularCustomeQueue();
        DyanmicCircular  queue = new DyanmicCircular();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        queue.display();

        System.out.println(queue.remove());
        queue.add(199); 

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
