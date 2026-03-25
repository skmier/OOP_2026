package practice4.Problem4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Meir",3.3));
        students.add(new Student("Abl",3.4));
        students.add(new Student("Damir",3.2));
        students.add(new Student("Daulet",3.1));
        students.add(new Student("Baha",3.3));

        System.out.println("List of Students before sorting:");
        for(Student s :students){
            System.out.println(s);
        }

        System.out.println("\nList of Students after sorting by gpa:");
        students.sort(Student::compareTo);
        for(Student s :students){
            System.out.println(s);
        }

        System.out.println("\nList of Students after sorting by name:");
        students.sort(new NameComparator());
        for(Student s :students){
            System.out.println(s);
        }
    }
}
