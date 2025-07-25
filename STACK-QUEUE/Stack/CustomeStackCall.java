package Stack;

public class CustomeStackCall {
    
    public static void main(String[] args) throws Exception {
        
        DyanmicStack stack = new DyanmicStack();

        stack.push(10);        
        stack.push(20);        
        stack.push(30);        
        stack.push(40);        
        stack.push(50);
        stack.push(60);
        
        //top element
        System.out.println(stack.peek());
        // pop from end to start
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
