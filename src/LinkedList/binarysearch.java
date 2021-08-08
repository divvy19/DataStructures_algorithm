package LinkedList;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class binarysearch {

    //function to insert a node at the starting of the linkedlist

    static Node push(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head ;
        head = newNode;
        return head;

    }

    //Function to find the middle element using fast and slow pointers.

    static Node middleNode(Node start, Node last){
        if(start == null)
            return null;

        Node slow = start;
        Node fast = start.next;

        while(fast != last){
            fast = fast.next;

            if(fast != last){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;

    }

    //Function to insert a node at the beginning of the Singly linked list and performing Binary Search

    static Node binarySearch(Node head, int value){
        Node start = head ;
        Node last = null;

        do{
            Node mid = middleNode(start, last);

            // if the mid value is null
            if(mid == null)
            return null;

            // if the mid value is the original value
           if(mid.data == value)
           return mid;
           //if the value is less than mid
           else if(mid.data > value) {
               start = mid.next;

           }
        
           //if the value is more than mid
           else 
           last = mid;


        }while(last == null || last != start);

        return null;
    }

    void print_list(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Node head = null;

        binarysearch b1 = new binarysearch();

        head = push(head, 1);
        head = push(head, 4);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 9);
        head = push(head, 10);

        b1.print_list(head);

        int value =98;

        if (binarySearch(head, value) == null)
        {
            System.out.println("Value not present");
        }
        else
        {
            System.out.println("Present");
        }

        
    }
    
}
