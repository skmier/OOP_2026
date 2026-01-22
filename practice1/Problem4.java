package practice1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double D = Math.pow(b,2) - 4 * a * c;
        if(D < 0){
            System.out.println("Error");
        } else if(D == 0){
            float x = (float) (-b / (2 * a));
            System.out.println(x);
        } else {
            float x1 = (float) ((-b + Math.sqrt(D)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(D)) / (2 * a));
            System.out.println("X1 is " +  x1 + "\n" + "X2 is: " + x2);
        }
        scan.close();
    }
}
