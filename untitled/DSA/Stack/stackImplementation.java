import java.util.Stack;

public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(1);
        stack1.push(4);
        stack1.push(5);
        stack1.push(8);

        //printing the topmost element 
        System.out.println("The topmost element before deletion :"+stack1.peek());

        //deleting topmost element
        stack1.pop();
        System.out.println("The topmost element after deletion is : "+stack1.peek());
        
        //searching in stack
        System.out.println("The element 4 is present at location: "+stack1.search(4));

        //empty stack
        System.out.println("Is stack empty? :"+stack1.empty());

    }
    
}
