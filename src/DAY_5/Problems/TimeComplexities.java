package DAY_5.Problems;

public class TimeComplexities {

    static void function(int k){
        //O(n)
        for(int i = 0;i<k;i++){
            System.out.println(i);
        }
    }

    static void function1(int k){
        // O(N)
        for(int i = 0; i< k*k;i++){
            System.out.println(i);
        }
    }

    static void function2(int k){
        // O(1)
        // no relation between no of repeation and input
        for(int i = 0; i< 10;i++){
            System.out.println(k);
        }
    }

    static void function3(int k){
        // O(n/2)
        // O(n)
        // equal or above half its O(n)
        for(int i = 0; i< k/2;i++){
            System.out.println(k);
        }
    }

    static void function4(int k){
        // O(n2)
        // n * (n / 2) = n^2 / 2
        // (n/2) * (n/2) = n^2/ 4
        for(int i = 0; i< k;i++){
            for(int j = 0; j< k/2;j++) {
                System.out.println(k);
            }
        }
    }

    static void function5(int k){
        // O(n)


        while(k>0){
            k = k-1;
            System.out.println(k);
        }
    }

    static void function6(int k){
        // N^2 + N
        while(k>0){
            k = k-1;
            System.out.println(k);
        }

        k = k*k;
        while(k>0){
            k = k-1;
            System.out.println(k);
        }

    }

    static void function7(int k){
        // 64 = 1 * 2 * 2 * 2 * 2 * 2 * 2
        // log2(64) = 6
        // log (1024) = 10

        //
        while(k>0){
            k = k/2;
            System.out.println(k);
        }
    }



    public static void main(String[] args){
        function7(1000);
//        1024 = 10;
//        1024 -> 2048; -> 10
    }
}
