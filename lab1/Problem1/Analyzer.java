package lab1.Problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Data analyzer = new Data();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Enter number, (Q) to quit: ");
            String value = scan.next();
            if(value.equals("q") || value.equals("Q")){
                break;
            }
            int t = Integer.parseInt(value);
            analyzer.addValue(t);
        }

        System.out.println("Average = " + analyzer.avg());
        System.out.println("Maximum = " + analyzer.getMax());
        scan.close();
    }
}
