package DAY_7.Problems;


import java.util.HashSet;

public class Duplicates_In_LinkedList {
    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i],future);
            future = head;
        }

        return head;
    }

    static void printOneNode(Node temp){
        String nextValue = temp.next==null?"null": String.valueOf(temp.next.hashCode());
        System.out.println("LinkedListNode{" +
                "id=" + temp.getId() +
                ", data=" + temp.data +
                ", next=" + nextValue +
                '}');
    }

    static void printNodeChain(Node node){
        for(Node temp = node; temp!=null; temp = temp.next){
            String nextValue = temp.next==null?"null": String.valueOf(temp.next.hashCode());
            System.out.println("LinkedListNode{" +
                    "id=" + temp.getId() +
                    ", data=" + temp.data +
                    ", next=" + nextValue +
                    '}');
        }
    }

    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,1,2,3};
        Node head = createSinglyLinkedListBackward(x);
        HashSet<Integer> hs = new HashSet<>();
        printNodeChain(head);

        // iteration
        Node temp = head;
        System.out.println("DUPLICATE ELEMENTS");
        while(temp!= null){
//            System.out.println(temp.data);
            if(hs.contains(temp.data)){
                printOneNode(temp);
            }else{
                hs.add(temp.data);
            }
            temp = temp.next;
        }
//        System.out.println(hs);

    }
}
