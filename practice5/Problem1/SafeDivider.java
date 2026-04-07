package practice5.Problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            try {
                int x1 = scan.nextInt();
                int x2 = scan.nextInt();
                double realRes = (double) x1 /x2;
                int res =  x1 / x2;
                System.out.println(realRes);

            } catch (ArithmeticException ae){
                System.out.println("You cannot "+ ae.getMessage());
            } catch (InputMismatchException ime){
                scan.nextLine();
                System.out.println("Please enter integer: ");
            }
        }


    }
}
