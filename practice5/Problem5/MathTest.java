package practice5.Problem5;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class MathTest {

    private static String expFile = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem5\\expressions";
    private static String resFile = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem5\\result.txt";
    private static String logFile = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem5\\log.txt";

    public static void main(String[] args) {

        try (
                Scanner scanner = new Scanner(new File(expFile));
                FileWriter resfw = new FileWriter(resFile);
                FileWriter fwLog = new FileWriter(logFile);
        ) {

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine().trim();

                try {
                    StringTokenizer st = new StringTokenizer(line, "+-/*", true);

                    String first = st.nextToken();
                    double x1 = Double.parseDouble(first.trim());

                    String operator = st.nextToken();

                    String second = st.nextToken();
                    double x2 = Double.parseDouble(second.trim());

                    if (st.hasMoreTokens()) {
                        throw new Exception("Extra data");
                    }

                    double res;

                    if (operator.equals("+")) {
                        res = x1 + x2;

                    } else if (operator.equals("-")) {
                        res = x1 - x2;

                    } else if (operator.equals("*")) {
                        res = x1 * x2;

                    } else if (operator.equals("/")) {
                        if (x2 == 0) {
                            throw new ArithmeticException();
                        }
                        res = x1 / x2;

                    } else {
                        throw new UnsupportedOperationException();
                    }
                    resfw.write(line + " = " + res + "\n");

                }catch (NumberFormatException e) {
                    fwLog.write("Error: Not a number in " + line + "\n");

                } catch (ArithmeticException e) {
                    fwLog.write("Error: Division by zero " + line + "\n");

                } catch (UnsupportedOperationException e) {
                    fwLog.write("Error: Bad operator in " + line + "\n");

                } catch (Exception e) {
                    fwLog.write("Error: Extra data in " + line + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}