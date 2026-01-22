package OOP_2026.practice.practice1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int myGrade = scan.nextInt();
        if(myGrade >= 95 && myGrade <= 100){
            System.out.println("A");
        } else if(myGrade >= 90 && myGrade < 95 ){
            System.out.println("A-");
        } else if(myGrade >= 85 && myGrade < 90 ){
            System.out.println("B+");
        } else if(myGrade >= 80 && myGrade < 85 ){
            System.out.println("B");
        } else if(myGrade >= 75 && myGrade < 80 ){
            System.out.println("B-");
        } else if(myGrade >= 70 && myGrade < 75 ){
            System.out.println("C+");
        } else if(myGrade >= 65 && myGrade < 70 ){
            System.out.println("C");
        } else if(myGrade >= 60 && myGrade < 65 ){
            System.out.println("C-");
        } else if(myGrade >= 55 && myGrade < 60 ){
            System.out.println("D+");
        } else if(myGrade >= 50 && myGrade < 55 ){
            System.out.println("D");
        } else if(myGrade >= 0 && myGrade < 50 ){
            System.out.println("F");
        } else {
            System.out.println("Another grade");
        }
        scan.close();
    }
}
