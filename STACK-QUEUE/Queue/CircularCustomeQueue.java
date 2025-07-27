package Queue;

public class CircularCustomeQueue {
    
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    int front = 0;
    int end =0;
    int size =0 ;

    public CircularCustomeQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularCustomeQueue(int size){
        this.data = new int[size];
    }

    public  boolean add(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

     public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        }while(i != end);
            System.out.println("END");
        
    }

}
