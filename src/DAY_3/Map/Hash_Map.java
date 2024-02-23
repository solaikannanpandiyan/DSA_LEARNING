package DAY_3.Map;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;

class student extends Object{
    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof student)) return false;
//        student student = (student) o;
//        return age == student.age && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}

public class Hash_Map {
    public static void main(String[] args){
        Integer x = Integer.valueOf(100);
        Integer y = Integer.valueOf(100);

        System.out.println("Wrapper Classes ");
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        System.out.println();

        student s1 = new student("ajay",18);
        student s2 = new student("ajay",18);
        student s3 = new student("ajay",18);

        System.out.println("objects without hashcode overriden ");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}
