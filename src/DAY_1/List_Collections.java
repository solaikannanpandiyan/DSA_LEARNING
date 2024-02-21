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
        System.out.println();
        System.out.println("ADD");
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);

        // Read
        System.out.println();
        System.out.println("READ");
        System.out.println(ls.get(0));
        System.out.println(ls);

        // Update
        System.out.println();
        System.out.println("UPDATE");
        ls.set(1,20);
        System.out.println(ls);

        ls.add(2);

        // Delete
        System.out.println();
        System.out.println("DELETE");
        ls.remove(2);
        System.out.println(ls);
        ls.remove(new Integer(1));
        System.out.println(ls);

        // Iteration
        System.out.println();
        System.out.println("ITERATE");
        ls.add(1);
        ls.add(2);
        for(int i :ls){
            System.out.println(i);
        }
        System.out.println();

        for(Integer i :ls){
            System.out.println(i);
        }
        System.out.println();

        for(int i = 0 ;i< ls.size();i++){
            System.out.println(ls.get(i));
        }
        System.out.println();

        Iterator<Integer> ix = ls.iterator();
        while(ix.hasNext()) {
            System.out.println(ix.next());
        }

        //

        // Search
        System.out.println();
        System.out.println("SEARCH");
        System.out.println(ls.contains(20));
        System.out.println(ls.indexOf(new Integer(20)));
        System.out.println(ls.lastIndexOf(new Integer(20)));

        // Sort
        System.out.println();
        System.out.println("SORT");

    }


}
