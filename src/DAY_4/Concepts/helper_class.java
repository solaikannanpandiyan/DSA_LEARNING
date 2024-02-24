package DAY_4.Concepts;

import java.util.*;

class Employee{
    String name;
    int age;
    String work;

    public Employee(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }
}

public class helper_class {
    public static void main(String[] args){
        int[] x = {5,2,9,3,1};
        System.out.println("ARRAYS");
        Arrays.sort(x);
        System.out.println(x);
        System.out.println(Arrays.toString(x));

        System.out.println("ARRAYLIST");
        List<Integer> m = Arrays.asList(5,2,9,3,1);
        ArrayList<Integer> arl = new ArrayList<>(m);
        System.out.println(arl);
        arl.sort(Comparator.reverseOrder());
        System.out.println(arl);
        arl.sort(Comparator.naturalOrder());
        System.out.println(arl);

        Collections.sort(arl,Comparator.reverseOrder());
        System.out.println(arl);
        Collections.sort(arl,Comparator.naturalOrder());
        System.out.println(arl);


        ArrayList<Employee> arem = new ArrayList<>();
        arem.add(new Employee("vimal",23,"software"));
        arem.add(new Employee("ajay",21,"civil"));
        arem.add(new Employee("rahul",25,"mechanical"));

        arem.sort( (first,second) -> {
            System.out.println(first);
            System.out.println(second);
            return second.age-first.age;}
        );

        System.out.println(arem);
//        arem.sort((first,second) -> {return  first.name.compareTo(second.name);});
//        System.out.println(arem);
//        arem.sort((first,second) -> {return first.work.compareTo(second.work);});
//        System.out.println(arem);




    }
}
