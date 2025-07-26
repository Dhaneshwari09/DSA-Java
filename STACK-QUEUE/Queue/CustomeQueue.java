package Queue;

public class CustomeQueue {

    protected int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    int front = 0;
    int end = 0;

    public CustomeQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CustomeQueue(int size) {
        data = new int[size];
    }

    public boolean add(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        return removed;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return front == end;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
}
