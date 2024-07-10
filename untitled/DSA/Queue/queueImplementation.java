import java.util.LinkedList;
import java.util.Queue;

public class queueImplementation{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        //to add the data in a queue - enqueue
        for(int i=0;i<10;i++){
            q.add(i);
        }
        System.out.println("The Queue looks like :"+q);

        //displaying top element
        System.out.println("The topmosst element before deletion is :"+q.peek());

        //Deleting the top element
        q.remove();
        System.out.println("The topmost element after deletion is :"+q.peek());

        //size of array
        System.out.println("The size of array is "+q.size());


    }
}