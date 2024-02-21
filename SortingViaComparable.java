import java.util.*;
public class SortingViaComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(23, "admi"));
        list.add(new Student(41, "adi"));
        list.add(new Student(18 , "parul"));
        list.add(new Student(21 , "vaish"));
        Collections.sort(list);
        for(var i : list) System.out.println(i);
    }
}
class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age , String name) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student o) {
        if(this.age < o.age) return -1;
        else return 1;
    }
}
