package DAY_7.Problems;


import java.lang.reflect.Array;

class Node {

    private int id;

    int data;

    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
        this.id = this.hashCode();
    }


    @Override
    public String toString() {
        return "LinkedListNode{" +
                "id=" + id +
                ", data=" + data +
                ", next=" + next +
                '}';
    }
}


public class CircularLinkedList {
    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i],future);
            future = head;
        }

        return head;
    }

    static void printNode(Node node){
        for(Node temp = node; temp!=null; temp = temp.next){
            System.out.println(temp);
        }
    }

    public static void main(String[] args){
        int[] arr = {1,5,7,9};
        Node head = createSinglyLinkedListBackward(arr);
        Node temp = head;
        // to find tail
        while(temp.next != null)
            temp = temp.next;

        // creating a circular linked list
        Node tail = temp;
        tail.next = head;

        // insert 9 after the node with value 5
        temp = head;
        do{
            if(temp.data == 5){
                Node next = temp.next;
                temp.next = new Node(9,next);
            }
            temp = temp.next;
        }while(temp != head);

//         iteration
        System.out.println("INSERTION");
        temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);

        // remove node with value 5
        temp = head;
        Node prev = null;
        Node removedNode = null;
        do{
            if(temp.data == 5){
                prev.next = temp.next;
                temp.next = null;
                removedNode = temp;
                temp = prev.next;
//                break;
            }
            prev = temp;
            temp = temp.next;
        }while(temp != head);
        System.out.println("REMOVED");
        System.out.println("REMOVE NODE:"+ removedNode);
        temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp != head);



    }

}
