// Implementation of stack using the queue data structure
// time complexity add - O(n)
// time complexity remove - O(1)
// space complexity - O(n)

import java.util.LinkedList;
import java.util.Queue;

public class stackusingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void enQueue(int data) {

        // adding value on q1
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }

        // push new data in q1
        q1.add(data);

        // moving element back to q1 from q2
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }

    }

    // deleting data from stack
    static int remove() {
        if (q1.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
        }
        int ele;
        ele = q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stackusingQueue q = new stackusingQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        // pop all ele from stack
        System.out.println("deleted element is : " + q.remove());

    }

}
