package practice1;

import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        System.out.println("Area: "+ area(a));
        System.out.println("Perimeter:" + perimeter(a));
        System.out.println("Length of diagonal : " + lengthOfDiagonal(a));
    }
    public static float area(int a){
        return a * a;
    }

    public static float perimeter(int a){
        return a * 4;
    }

    public static float lengthOfDiagonal(int a){
        return (float) (a * Math.sqrt(2));
    }
}
