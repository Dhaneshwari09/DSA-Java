package Queue;

import Stack.CustomeException;

public class DyanmicCircular extends CircularCustomeQueue {
    
     public DyanmicCircular() {
        super(); 
    }

    public DyanmicCircular(int size) {
        super(size); 
    }

   @Override
public boolean add(int item) throws Exception {
    if (super.isFull()) {
        int[] temp = new int[super.data.length * 2];
        for (int i = 0; i < super.data.length; i++) {
            temp[i] = super.data[(front + i) % super.data.length];
        }
        super.front = 0;
        super.end = super.data.length;
        super.data = temp;
    }
    return super.add(item);
}

}
