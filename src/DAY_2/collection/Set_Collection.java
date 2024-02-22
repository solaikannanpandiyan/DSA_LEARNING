package DAY_2.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Set_Collection {
    public static void main(String[] args){
        // Create
        HashSet<String> hs = new HashSet<>();

        //ArrayList = child
        //List = parent
        //parent container/variable = child object - allowed
        //child container/variable = parent object - not allowed

        //add
        System.out.println();
        System.out.println("ADD");
        hs.add("vimal");
        hs.add("vicky");
        hs.add("vimal");
        hs.add("ajay");
        hs.add("ajay");
        System.out.println(hs);

        // Read
        System.out.println();
        System.out.println("READ");


        // Update
        System.out.println();
        System.out.println("UPDATE");


        // Delete
        System.out.println();
        System.out.println("DELETE");
        hs.remove("vimal");
        System.out.println(hs);


        // Iteration
        System.out.println();
        System.out.println("ITERATE");
        for(String names: hs){
            System.out.println(names);
        }
        Iterator<String> ix=hs.iterator();




        //

        // Search
        System.out.println();
        System.out.println("SEARCH");
        System.out.println(hs.contains("ajay"));


        // Sort
        System.out.println();
        System.out.println("SORT");



    }
}
