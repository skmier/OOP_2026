package lab1.Problem4;

import practice2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook g1 = new GradeBook();
        g1.displayMessage();

        System.out.println("Please, input grade for students");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Student ");
            String name = scanner.next();
            if(name.equals("q")) break;
            System.out.print("Grade of student ");
            double grade = scanner.nextDouble();
            Student s1 = new Student(name,grade);
            g1.addStudent(name,grade);
        }
        scanner.close();

        g1.displayGradeReport();
    }
}
