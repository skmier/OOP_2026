package OOP_2026.practice.practice1;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialBalance = scan.nextInt();
        int precent = scan.nextInt();
        float interestRate = (float) precent / 100;
        float earned = initialBalance * interestRate;
        float newBalance = initialBalance + earned;
        System.out.println("New Balance: " + newBalance);
        scan.close();
    }
}
