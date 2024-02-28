package DAY_7.Problems;
import java.util.Arrays;

public class LL_REVERSE {
    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i],future);
            future = head;
        }

        return head;
    }

    static Node createSinglyLinkedListForward(int[] input){
        Node past = null;
        Node tail = null;
        Node head = null;
        for (int j : input) {
            tail = new Node(j, null);
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

    static void printNode(Node node){
        for(Node temp = node; temp!=null; temp = temp.next){
            System.out.println("LinkedListNode{" +
                    "id=" + temp.getId() +
                    ", data=" + temp.data +
                    ", next=" + temp.next +
                    '}');
        }
    }

    static Node reverse(Node head ){
        if(head == null){
            return head;
        }
        Node temp = head.next;
        Node curr = head;
        Node prev = null;

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
        Node head = createSinglyLinkedListBackward(x);
        System.out.println("BEFORE REVERSING");
        for(Node temp = head; temp!=null; temp = temp.next){
            System.out.println(temp);
        }
        Node curr = reverse(head);
        System.out.println("REVERSED ");
        for(Node temp = curr; temp!=null; temp = temp.next){
            System.out.println(temp);
        }

    }
}
