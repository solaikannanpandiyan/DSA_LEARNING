package DAY_5.Problems;


import java.util.Arrays;

class Stack_Using_Array{

    private int default_size = 3;
    private int[] array;

    private int ref = -1;

    public Stack_Using_Array(int size) {
        // space complexity: O(n)
        // time complexity: O(1)
        this.array = new int[size];
    }

    public Stack_Using_Array() {
        // space complexity: O(1)
        // time complexity: O(1)
        this.array = new int[default_size];
    }

    public boolean push(int input){
        // time complexity: O(1)
        // spacecomplexity: O(1)
        ref = ref +1;
        if(ref == array.length){
            ref--;
            return false;
        }
        array[ref] = input;
        return true;
    }

    public int pop(){
        // space complexity: O(1)
        // time complexity: O(1)
        if(isEmpty()){
            return -1;
        }
        int curr = array[ref];
        array[ref] = 0;
        ref = ref - 1;
        return curr;
    }

    public boolean isEmpty(){
        // space complexity: O(1)
        // time complexity: O(1)
        if(ref == -1)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Stack_Using_Array " +
                Arrays.toString(array)
                ;
    }
}




public class isPalindrome {

    static boolean ispalindrome(String input){
        //time complexity:
        //space complexity:

        return true;
    }

    public static void main(String arg[]){
        String input1 = "MADAM";
        String input2 = "ROCKET";
        System.out.println(ispalindrome(input1));
        System.out.println(ispalindrome(input2));

    }
}
