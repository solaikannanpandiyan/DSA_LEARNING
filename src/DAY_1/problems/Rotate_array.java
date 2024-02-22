package DAY_1.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate_array {

    public static void reverse(ArrayList<Integer> arr,int start,int end){
        if(arr == null){
            System.out.println("input array list is null");
            return;
        }
        if(arr.size() == 0){
            System.out.println("arr is empty");
            return;
        }
        for(int i = 0; i< (end+1/2);i++){
            int temp = arr.get(i);
            arr.set(i,arr.get(end-i));
            arr.set(end-i,temp);
        }
        System.out.println(arr);
    }

    public static void rotate_using_rev(){

    }


    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<= 100;i++){
            arr.add(i);
        }
        System.out.println(arr);

    }


}
