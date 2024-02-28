package DAY_7.Concepts;

public class RECURSION {

    static void count(int x){
        if(x == 0) return;
        System.out.println(x);
        count(x-1);
        System.out.println(x);
    }
    // 5 4 3 2 1 5
    // 5 4 3 2 1
    // 5 4 3 2 1 1 2 3 4 5
    // 5 4 3 2 1 0

    public static void main(String[] args){
        count(5);
    }
}
