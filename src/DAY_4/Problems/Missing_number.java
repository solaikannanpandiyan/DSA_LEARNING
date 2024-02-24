package DAY_4.Problems;

import java.util.*;

public class Missing_number {

    static void usingArray(ArrayList<Integer> arr){

    }

    static void usingNegativeMarker(ArrayList<Integer> arr){
        //assuming all are positive numbers
        //make all positive numbers
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < 0 ){
                arr.set(i,arr.get(i)*-1);
            }
        }
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int val = arr.get(i);
            if(val<0) val = val*-1;
            if(val>0 && val < arr.size())
                arr.set(val-1,-1*arr.get(val-1));
        }
//        System.out.println(arr);
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0){
                missing.add(i+1);
            }
        }
        System.out.println(missing);
    }
    static void usingHashSet(ArrayList<Integer> arr){
        HashSet<Integer> hs = new HashSet<>(arr);
        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= arr.size(); i++){
            if(!hs.contains(i))
                missing.add(i);
        }
        System.out.println(missing);
    }

    static void usingSortOneMissingNo(ArrayList<Integer> arr){
        arr.sort(Comparator.naturalOrder());
        ArrayList<Integer> misses = new ArrayList<>();
        int i = 0;
        int last = 0;
        while(i < arr.size()){
            if(arr.get(i) - last != 1){
                misses.add(last+1);
                break;
            }
            last = arr.get(i);
            i++;
        }
        System.out.println(misses);
    }

    static void usingSum(ArrayList<Integer> arr){
        int expected_sum = (arr.size() * (arr.size()+1)) / 2;
        ArrayList<Integer> missed = new ArrayList<>();
        int total_sum = 0;
        for(int x:arr){
            if( (x > 0) && (x <= arr.size()) ){
                total_sum += x;}
        }
        missed.add(expected_sum - total_sum);
        System.out.println(missed);
    }
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(4,9,-6,3,1);
        ArrayList<Integer> arr = new ArrayList<>(input);
        usingSum(arr);
        // time: O(N)
        // space: O(1)
        usingSortOneMissingNo(arr);
        // time: O(nLogn)
        // space: O(1)
        usingHashSet(arr);
        // time: O(N)
        // space: O(N)
        usingArray(arr);
        // time: O(N)
        // space: O(N)
        usingNegativeMarker(arr);
        // space: O(1)
        // time: O(N)
    }
}







