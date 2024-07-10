import java.util.Queue;
import java.util.Stack;

public class queueUsingStack {
    static Stack<Integer> stack1=new Stack();
    static Stack<Integer> stack2=new Stack(); 

    //inserting data in a Queue
    //time complexity =O(1)
    static void enQueue(int data){
        stack1.push(data);
    }
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty..");
            System.exit(0);
        }
        //pushing all element from stack1 into stack2
        if (stack2.empty()){
            while(!stack1.empty()){
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        ele=stack2.pop();
        return ele;
    }
    public static void main(String[] args) {
        queueUsingStack q =new queueUsingStack();
        //functionn calling for insertion
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        //function calling for deletion
        System.out.println("deleted ele is :"+q.deQueue());
    }
}
