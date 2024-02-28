package DAY_6.Concepts;


import java.util.Arrays;


class LinkedListNode{

    int data;

    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

}
public class LinkedListCustom {

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
        for(int i = 0;i<input.length;i++){
            tail = new LinkedListNode(input[i],null);
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

    public static void main(String[] args){
        int[] x = {1,5,7,9};
        System.out.println(Arrays.toString(x));
        LinkedListNode node4 = new LinkedListNode(9,null);
//        LinkedListNode node3 = new LinkedListNode(7,node4);
//        LinkedListNode node2 = new LinkedListNode(5,node3);
//        LinkedListNode node = new LinkedListNode(1,node2);
//        LinkedListNode head = node;
//        while(node != null){
//            System.out.println(node.data);
//            node = node.next;
//        }
        LinkedListNode head = createSinglyLinkedListForward(x);
        for(LinkedListNode temp = head;temp!=null;temp = temp.next){
            System.out.println(temp.data);
        }

    }



}
