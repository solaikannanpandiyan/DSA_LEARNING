package DAY_2.collection;

import java.util.*;

public class Linked_List_Collection {
    public static void main(String[] args){
        // Create
        LinkedList<Integer> ll = new LinkedList<>();

        //ArrayList = child
        //List = parent
        //parent container/variable = child object - allowed
        //child container/variable = parent object - not allowed

        //add
        System.out.println();
        System.out.println("ADD");

        System.out.println(ll);

        // Read
        System.out.println();
        System.out.println("READ");


        System.out.println(ll);

        // Update
        System.out.println();
        System.out.println("UPDATE");


        System.out.println(ll);


        // Delete
        System.out.println();
        System.out.println("DELETE");


        System.out.println(ll);

        // Iteration
        System.out.println();
        System.out.println("ITERATE");

        for(int i :ll){
            System.out.println(i);
        }
        System.out.println();

        for(Integer i :ll){
            System.out.println(i);
        }
        System.out.println();

        for(int i = 0 ;i< ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println();

        Iterator<Integer> ix = ll.iterator();
        while(ix.hasNext()) {
            System.out.println(ix.next());
        }
        System.out.println(ll);

        //

        // Search
        System.out.println();
        System.out.println("SEARCH");

        System.out.println(ll);

        // Sort
        System.out.println();
        System.out.println("SORT");

        System.out.println(ll);


    }
}
