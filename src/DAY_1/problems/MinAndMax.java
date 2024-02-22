package DAY_1.problems;

import java.util.ArrayList;
import java.util.Iterator;

public class MinAndMax {

    public static void foreachloop(){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        ArrayList<Integer> ax = new ArrayList<>();
        ax.add(19);
        ax.add(-3);
        ax.add(7);
        ax.add(23);
        ax.add(5);
        System.out.println(ax);

        for(int x :ax){
            if(x > Max){
                Max = x;
            }
            if(x < Min){
                Min = x;
            }
        }
        System.out.println("MAX element: "+Max);
        System.out.println("MAX element: "+Min);
    }

    public static void forloop(){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        ArrayList<Integer> ax = new ArrayList<>();
        ax.add(19);
        ax.add(-3);
        ax.add(7);
        ax.add(23);
        ax.add(5);
        System.out.println(ax);

        for(int i = 0; i < ax.size();i++){
            int x = ax.get(i);
            if(x > Max){
                Max = x;
            }
            if(x < Min){
                Min = x;
            }
        }
        System.out.println("MAX element: "+Max);
        System.out.println("MAX element: "+Min);
    }

    public static void iter(){
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;

        ArrayList<Integer> ax = new ArrayList<>();
        ax.add(19);
        ax.add(-3);
        ax.add(7);
        ax.add(23);
        ax.add(5);
        System.out.println(ax);
        Iterator<Integer> itx = ax.iterator();
        while(itx.hasNext()){
            int x = itx.next();
            if(x > Max){
                Max = x;
            }
            if(x < Min){
                Min = x;
            }
        }
        System.out.println("MAX element: "+Max);
        System.out.println("MAX element: "+Min);
    }

    public static void main(String[] args){
        iter();


    }


    }
