package DAY_8.Problems;

import DAY_7.Problems.Node;

public class Recursion_Problems {
    static Node createSinglyLinkedListBackward(int[] input){
        Node head = null;
        Node future = null;
        for(int i = input.length-1;i>=0;i--){
            head = new Node(input[i],future);
            future = head;
        }

        return head;
    }

    static void openClose(int x){
        if(x == 0)
            return;
        System.out.println("Open " + x);
        openClose(x-1);
        System.out.println("Close " + x);
    }

    static void printLL(Node head){
        if(head == null)
            return;
        System.out.println(head.data);
        printLL(head.next);
    }

    static int fib(int x){
        if(x<=2){
            return x -1;
        }
        int prev = fib(x-1); //fib(2) -> 1
        int beforeprev = fib(x-2);//fib(1) -> 0
        return prev + beforeprev;
    }

    static int fibIter(int x) {
        if(x<=2){
            return x -1;
        }
        int x1 = 0; //1 1 2
        int x2 = 1; //1 2 3
        for(int i = 3;i<=x;i++){
            int temp = x2;
            x2 = x2 + x1;
            x1 = temp;
        }
        return x2;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = createSinglyLinkedListBackward(arr);
//        printLL(head);
        //fibonacci series:  0 1 1 2 3 5 8 13 21 34
        //*nth fibonaci num: 1 2 3 4 5 6 7 8  9  10
        int x = fibIter(500);
        System.out.println(x);
    }
}
