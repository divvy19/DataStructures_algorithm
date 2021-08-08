package LinkedList;



public class printMiddle {

    static Node head;
    //Link List node

    class Node{
        int data;
        Node next;

        public Node(Node next,int data){
            this.data = data;
            this.next = next;
        }
    }

    void push_head(Node head_ref,int new_data)
    {
        Node new_node = new Node(head_ref,new_data);
        head = new_node;
    }

    void print_list(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }



    //Driver code
    public static void main(String arg[]){
        printMiddle p1 = new printMiddle();

        //Push the head in the linked list
        //Print the current linked list
        //Get the middle term of the head list

        for ( int i=5 ; i>0; i--){
            p1.push_head(head, i);
            p1.print_list(head);
            Node head1 = head;
            //initliazing the counter as zero
            int count = 0;
            //make the mid the head
            Node mid = head1;
            
            while(head1 != null){
            
                if (( count%2 ) == 1)
                mid = mid.next;
                ++count;
                head1 = head1.next;
            }
            
            if (mid != null)
            
            System.out.println("The middle element is [" +
            mid.data + "]\n");
        }



    }


    
}
