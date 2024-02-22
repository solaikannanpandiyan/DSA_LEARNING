package DAY_1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Rotate_array {

    public static void reverseUsingArraylistMethods(ArrayList<Integer> arr,int rotate){
        for(int i = 0; i<rotate; i++){
            int x = arr.remove(0);
            arr.add(x);
        }
    }

    public static void reverseUsingLinkedlistMethods(LinkedList<Integer> arr, int rotate){
        for(int i = 0; i<rotate; i++){
            int x = arr.remove(0);
            arr.add(x);
        }
    }


    public static void reverse(ArrayList<Integer> arr,int start,int end){
        if(arr == null){
            System.out.println("input array list is null");
            return;
        }
        if(arr.size() == 0){
            System.out.println("arr is empty");
            return;
        }
        while(start<end){
            int x = arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,x);
            start++;
            end--;
        }
    }


    public static void rotate_using_rev(ArrayList<Integer> arr,int rotation){
        reverse(arr,0,rotation-1);
        reverse(arr,rotation,arr.size()-1);
        reverse(arr,0,arr.size()-1);
    }


    public static void main(String[] args){
//        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> arr = new LinkedList<>();
        int rotate = 1000;
        for(int i =1;i<= 1000000;i++){
            arr.add(i);
        }
//        System.out.println(arr);

        if(rotate > arr.size()){
            rotate = rotate % arr.size();
        }

        // Calculate the elapsed time
        long startTime = System.currentTimeMillis();

        // uncomment the function here to time it
//        rotate_using_rev(arr,rotate);
        reverseUsingLinkedlistMethods(arr,rotate);
//        reverseUsingArraylistMethods(arr,rotate);



        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(arr);
        // Print the elapsed time
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");


    }


}
