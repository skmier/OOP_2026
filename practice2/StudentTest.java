package practice2;

import java.time.Year;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Meir","24B03");
        System.out.println("Name: " + s1.getName() + " ID: " + s1.getId());
        s1.incrementYear();
        System.out.println("Year of Study: " + s1.getYearOfStudy());

        Student s2 = new Student("Sak","25B03");
        System.out.println("Name: " + s2.getName() + " ID: " + s2.getId());
        System.out.println("Year of Study: " + s2.getYearOfStudy());

    }
}
