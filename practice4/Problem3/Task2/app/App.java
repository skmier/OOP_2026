package practice4.Problem3.Task2.app;

import practice4.Problem3.Task2.models.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone i15 = new Iphone("15", 350000.0, "Type-C");
        Iphone i14 = new Iphone("14 pro", 400000, "Lightning");

        System.out.println("Iphone 14 pro: ");
        i14.showPhoneDescription();

        System.out.println("Iphone 15: ");
        i15.showPhoneDescription();
    }
}
