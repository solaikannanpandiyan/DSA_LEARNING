package DAY_2.collection;

import java.util.ArrayDeque;
import java.util.Stack;

public class Deque_Queue_Collection {
    public static void main(String[] args){
        ArrayDeque<String> stack = new ArrayDeque<>();

        System.out.println("STACK: ");
        stack.push("icecream");
        stack.push("chocolate");
        stack.push("popcorn");
//        "popcorn"
//        "chocolate"
//        "icecream"
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();
        System.out.println("QUEUE: ");
        ArrayDeque<String> queue = new ArrayDeque<String>();
        queue.addFirst("icecream");
        queue.addFirst("chocolate");
        queue.addFirst("popcorn");
//        "popcorn","chocolate","icecream"
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());



    }
}
