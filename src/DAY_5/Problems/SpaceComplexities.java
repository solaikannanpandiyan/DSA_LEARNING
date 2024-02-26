package DAY_5.Problems;

public class SpaceComplexities {
    // if no dependency on input
    // time complexity: 1 | space complexity: 1
    // dependency on input
    // how it affects repetition of code -> Time complexity || O(1),O(n),O(n^2)...etc
    // how it affects creation of new memory -> Space complexity || O(1),O(n),O(n^2)...etc

    static void function(int[] x){
        // O(N)
        int[] y = new int[x.length];
        System.out.println("hello");
    }

    static void function(int x){
        // O(1)
        System.out.println("hello");
    }

    static void function1(int x){
        // O(1)
        int[] arr = new int[10];
        System.out.println("hello");
    }

    static void function2(int x){
        //O(N)
        int[] arr = new int[x];
        System.out.println("hello");
    }

    static void function3(int x){
        //O(n)
        int[] arr = new int[x*x];
        System.out.println("hello");
    }


    public static void main(String[] args){
        function(new int[]{1,2,3,4});
//        1024 = 10;
//        1024 -> 2048; -> 10
    }
}
