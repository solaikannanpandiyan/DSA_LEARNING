package DAY_3.Map;

import java.util.*;

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

//        Create
        HashMap<String,Integer> hm = new HashMap<>();
//        Add
        System.out.println("ADD");
        hm.put("ajay",3000);
        hm.put("vimal",2500);
        hm.put("kamal",2500);
        System.out.println(hm);

//        Read
        System.out.println("READ");
        System.out.println(hm.get("ajay"));
        System.out.println(hm.get("vimal"));
        System.out.println(hm.get("kamal"));

        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm);

//        Update
        System.out.println("UPDATE");
        hm.put("ajay",30000);
        hm.put("vimal",25000);
        hm.put("kamal",25000);
        System.out.println(hm);

//        Delete
        System.out.println("DELETE");
        hm.remove("vimal");
        System.out.println(hm);

//        Iteration
        System.out.println("Iterations");

//        Iterator<Integer> itx = hm.values().iterator();
//        while(itx.hasNext()){
//            System.out.println(itx.next());
//        }

        for(String key : hm.keySet()){
            System.out.println(hm.get(key));
        }



//        Search


//        Sort

    }
}
