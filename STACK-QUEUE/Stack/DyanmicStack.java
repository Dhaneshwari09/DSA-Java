package Stack;

public class DyanmicStack extends CustomeStack {

    public DyanmicStack() {
        super(); // it will call the constructor of CustomeStack class
    }

    public DyanmicStack(int size) {
        super(size); // it will call the constructor of CustomeStack class
    }

    @Override
    public boolean push(int item) throws CustomeException {
        //this being take care of the size of array is full
        if (super.isFull()) {
            // double the array size
            int[] temp = new int[super.data.length * 2];

            // copy all previous item in new array
            for (int i = 0; i < super.data.length; i++) {
                temp[i] = super.data[i];
            }
            super.data = temp;
        }

        // at this point array is not full
        return super.push(item);
    }
}
