package Stack;

public class CustomeStack {
    
      protected int[] data;
      private final static int deault_size = 10;
      int ptr = -1;
      
      public CustomeStack(){
        this(deault_size);
      }

      public CustomeStack(int size){
         data = new int[size];
      }

      public boolean push(int item) throws CustomeException{
         if(isFull()){
            throw new CustomeException("Stack is full");
         }
         data[++ptr] = item;
         return true;
      }

      public boolean isFull(){
        if(ptr == data.length-1){
            return true;
        }else{
            return false;
        }
      }

      public int pop() throws CustomeException{
        if(isEmpty()){
            throw new CustomeException("Stack is empty,...");
        }
        return data[ptr--];
      }

      public boolean isEmpty(){
         return ptr ==  -1;
      }
      
      public int peek(){

        return data[ptr];
      }
}
