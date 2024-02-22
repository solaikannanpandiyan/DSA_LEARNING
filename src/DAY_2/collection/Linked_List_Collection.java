package DAY_2.collection;

import java.util.*;

class employee{
    String name;
    int age;
    int salary;
}

public class Linked_List_Collection {
    public static void main(String[] args){
        // Create
        LinkedList<String> ll = new LinkedList<>();

        //ArrayList = child
        //List = parent
        //parent container/variable = child object - allowed
        //child container/variable = parent object - not allowed

        //add
        System.out.println();
        System.out.println("ADD");
        ll.add("vimal");
        System.out.println(ll);
        ll.add(0,"ajay");

        // Read
        System.out.println();
        System.out.println("READ");
        System.out.println(ll.get(1));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
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

//        for(int i :ll){
//            System.out.println(i);
//        }
//        System.out.println();
//
//        for(Integer i :ll){
//            System.out.println(i);
//        }
//        System.out.println();
//
//        for(int i = 0 ;i< ll.size();i++){
//            System.out.println(ll.get(i));
//        }
//        System.out.println();
//
        Iterator<String> ix = ll.iterator();
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
