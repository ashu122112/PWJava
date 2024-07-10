import org.w3c.dom.Node;

public class Linkedlist {
    Node head;
    class Node{
        int data ;
        Node next;

        Node (int d ){
            data=d;
            next=null;
        }
    }
    // insertion of the data at very end of LL
    public void insertAtEnd(int newData)
    {
        //initialise the new node with new data entered by the user 
        Node newNode= new Node(newData);
        //if Linked list is empty 
        if(head==null){
            head=new Node(newData);
            return;
        }
        //linkedlist is not empty
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    // insertion of the data at very starting of LL
    public void insertAtBegin(int newData){
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
    }
    //insert after any place
    public void insertAfter(Node prev_Node,int newData){
        if (prev_Node==null){
            System.out.println("previous node cannot be a null");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prev_Node.next;
        prev_Node.next=newNode;

    }
    //Deleting a Node
    /* 
    void deleteNode(int position)
    {
        Node temp=head;
        //if first element is deleted
        if(position==0){
            head=temp.next;
        }
        //if any other node is to be deleted
        for(int i =0;i<position-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    */
    
    //Reversal of LL using iteration
    public void reversell(){
        Node curr=head;
        Node nextPtr=null;
        Node prev=null;
        while(curr != null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        head=prev;
        return;
    }

    //reversal of a LL using recursion 
    public void reverseRec(Node curr , Node prev){
        //last node of linked list
        if (curr.next==null){
            head = curr;
            curr.next=prev;
            return;
        }
        Node nextPtr= curr.next;
        curr.next=prev;
        // recusion 
        reverseRec(nextPtr, curr);
    }

    //implementation of finding data of middle element in a linked list
    //two pointer approach
    public void middleData(){
        Node fast = head , slow = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next;
        }
        System.out.println("Middle element of linked list is :" + slow.data);
    }

    //Loop deecting..
    // floyd's cycle detection algorithm
    public void detectLoop(){
        int flag=0;
        Node slow=head , fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }

        }
        if (flag==0){
            System.out.println("loop is not detected");
        }
        else{
            System.out.println("Loop is detected..");
        }
    }

    //implementation of display of data of LL
    public void displayLL(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        } 
    }
    public static void main(String[] args) {
        Linkedlist llist=new Linkedlist();
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(23);
        llist.insertAtEnd(20);

        llist.insertAtBegin(1);

        System.out.println("LL before entering 10: ");
        llist.displayLL();

System.out.println();

        llist.insertAtEnd(10);
        System.out.println("After entering 10: ");
        llist.insertAfter(llist.head.next.next,78);
        llist.displayLL();
        System.out.println();
        // System.out.println("After deleting ..");
        // llist.deleteNode(0);
        // llist.displayLL();
//         System.out.println();
//         llist.reversell();
//         System.out.println("After reversing the LL");
//         llist.displayLL();
// System.out.println();
// System.out.println("reverse by recursion");
//         llist.reverseRec(llist.head, null);
//         llist.displayLL();

//         System.out.println();
//         System.out.println("mioddle element is :");
//         llist.middleData();

        //circular LL
        Node temp=llist.head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=llist.head;

        llist.detectLoop();
        System.out.println();
    }
}
