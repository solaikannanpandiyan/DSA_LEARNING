package DAY_2.problem;

public class CodingPattern {

    // try to break them down
    static void good_pattern(int a){
        if( a%2 != 0 ) {
            System.out.println("odd");
        }

        System.out.println("even");

        if(a%10 == 0){
            System.out.println("divisible by  10");
        }

    }

    //nested if are bad and try to avoid as much as possible
    static void bad_pattern(int a){
        if( a%2 == 0 ){
            System.out.println("even");
            if(a%10 == 0){
                System.out.println("divisible by  10");
            }
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args){
        good_pattern(10);
        bad_pattern(10);
    }

}
