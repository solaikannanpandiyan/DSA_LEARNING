package DAY_11.Concepts;

import java.util.Arrays;

public class BinarySearch {

    static int binarySearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        int index = -1;
        int front = 0;
        int last = arr.length-1;
        int mid = 0;
        while(front<=last){
            mid = (front + last) / 2;
            System.out.println("front element: " + front + " mid element: " + mid + " last element: " + last);
            if(arr[mid] == target){
                index = mid;
                break;
            }

            if(arr[mid] < target){
                front = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        return index;
    }


    public static void main(String[] args){
        int[] arr = {11,5,7,5,6,1,3};
        int target = 11;
        Arrays.sort(arr);
        // iterative solution
        int index = binarySearch(arr,target);
        // Try recursive on your own
        System.out.println("Binary Search on : " + Arrays.toString(arr) + " target: " + target);
        System.out.println("INDEX :" + index);
    }

}
