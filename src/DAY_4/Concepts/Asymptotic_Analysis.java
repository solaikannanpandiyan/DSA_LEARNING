package DAY_4.Concepts;

public class Asymptotic_Analysis {
    // if no dependency on input
    // time complexity: 1 | space complexity: 1
    // dependency on input
    //
    static void printer_1(int x){
        // O(1)
        System.out.println(x);
    }

    static void printer_2(int x){
        // O(1)
        for(int i = 1; i <= 100 ; i++ ){
            System.out.println(x);
        }
    }

    static void printer_3(int x){
        //O(N)
        // 1 -> 1
        // 10 -> 10
        // 100 -> 100
        // 1000 -> 1000
        for(int i = 1; i <= x ; i++ ){
            System.out.println(x);
        }
    }

    static void printer_4(int x){
        //O(N^2)
        // 1 -> 1
        // 10 -> 100
        // 100 -> 10000
        // 1000 -> 1000000
        int count = 0;
        int count2= 0;

        for(int i = 1; i <= x*x ; i++ ){
//            System.out.println(x);
            count++;
        }
//        System.out.println(count);

        for(int i = 1; i <= x ; i++ ){ // 10
            for(int k = 1; k <= x ; k++ ) {  //10
//                System.out.println(x);
                count2++;
            }
        }
//        System.out.println(count2);

    }

    public static void main(String[] args){
        System.out.println("Time Complexity");
        printer_4(10);
//        printer(100000);
//        printer(10000000);

    }

}
