package DAY_7.Problems;
import java.util.Arrays;


class LinkedListNode{

    private int id;

    int data;

    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) {
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

public class LL_REVERSE {
    static LinkedListNode createSinglyLinkedListBackward(int[] input){
        LinkedListNode head = null;
        LinkedListNode future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new LinkedListNode(input[i],future);
            future = head;
        }

        return head;
    }

    static LinkedListNode createSinglyLinkedListForward(int[] input){
        LinkedListNode past = null;
        LinkedListNode tail = null;
        LinkedListNode head = null;
        for (int j : input) {
            tail = new LinkedListNode(j, null);
            if (past == null) { // will be true only once or first time
                head = tail;
                past = tail;
                continue;
            }
            past.next = tail;
            past = tail;
        }

        return head;
    }

    static void printNode(LinkedListNode node){
        for(LinkedListNode temp = node; temp!=null; temp = temp.next){
            System.out.println(temp);
        }
    }

    static LinkedListNode reverse(LinkedListNode head ){
        if(head == null){
            return head;
        }
        LinkedListNode temp = head.next;
        LinkedListNode curr = head;
        LinkedListNode prev = null;


        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            if(temp != null)
                temp = temp.next;
            System.out.println("CHAIN :");
            printNode(prev);

        }

        return prev;
    }


    public static void main(String[] args){
        int[] x = {1,5,7,9};
        System.out.println(Arrays.toString(x));
//        LinkedListNode node4 = new LinkedListNode(9,null);
//        LinkedListNode node3 = new LinkedListNode(7,node4);
//        LinkedListNode node2 = new LinkedListNode(5,node3);
//        LinkedListNode node = new LinkedListNode(1,node2);
//        LinkedListNode head = node;
//        while(node != null){
//            System.out.println(node.data);
//            node = node.next;
//        }
        LinkedListNode head = createSinglyLinkedListBackward(x);
        System.out.println("BEFORE REVERSING");
        for(LinkedListNode temp = head; temp!=null; temp = temp.next){
            System.out.println(temp);
        }
        LinkedListNode curr = reverse(head);
        System.out.println("REVERSED ");
        for(LinkedListNode temp = curr; temp!=null; temp = temp.next){
            System.out.println(temp);
        }

    }
}
