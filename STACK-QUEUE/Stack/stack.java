import java.util.Stack;

public class stack {
    
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(10);        
        stack.push(20);        
        stack.push(30);        
        stack.push(40);        
        stack.push(50);
        
        //top element
        System.out.println(stack.peek());
        // pop from end to start
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //----------can not pop empty stack ,it's give EmptyStackException
        // System.out.println(stack.pop());


    }
}
