package DAY_1;

public class wrapper_class {
    void boxing(){
        //Auto unboxing
        Integer k = 10;
        int m = k;

        //Auto boxing
        int l = 20;
        Integer n = l;

        System.out.println(m);
        System.out.println(n);
    }

    void wrapper_classes(){
       Character ch = 'a';
       Integer in = 1;
       Float fl = 1.0f;
       Double df = 1.000;
       Long lg = 1000L;
       Boolean bl = true;
       Short sh = 1;
       Byte bt = 1;
    }

    public static void main(String[] args){

    }
}
