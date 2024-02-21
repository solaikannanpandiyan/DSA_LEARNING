package DAY_1;

import java.util.*;


public class List_Collections {


    public static void main(String[] args){
        //static
//        int[] arr = new int[10];
//        int[] arr1 = {1,2,3};

        //dynamic
        // ArrayList<Integer> ls = new ArrayList<Integer>();

        // Create
        ArrayList<Integer> al = new ArrayList<Integer>();
        List<Integer> ls = new ArrayList<>();
        Collection<Integer> cl = new ArrayList<>();

//        ls = new Vector<Integer>();

        //ArrayList = child
        //List = parent
        //parent container/variable = child object - allowed
        //child container/variable = parent object - not allowed

        //add
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);

        // Read
        System.out.println("READ");
        System.out.println(ls.get(0));
        System.out.println(ls);
        // Update
        ls.set(1,10);
        System.out.println(ls);

        // Delete

        // Iteration

        // Search

        // Sort

    }


}
