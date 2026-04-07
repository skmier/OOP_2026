package practice5.Problem3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static String filePath = "C:\\Users\\saken\\IdeaProjects\\OOP_2026\\src\\practice5\\Problem3\\library.dat";
    private static List<Book> library = new ArrayList<>();
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            library = (ArrayList<Book>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("FIle is not found");
        } catch (IOException | ClassNotFoundException e) {
            library = new ArrayList<>();
        }

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter command:\n(A) Add book\n(L) List of books\n(B) quit");
            String command = scan.nextLine();
            if(command.equals("B")) break;
            else if (command.equals("A")) {
                System.out.println("Enter title: ");
                String title = scan.nextLine();
                System.out.println("Enter author: ");
                String author = scan.nextLine();
                System.out.println("Count of visit");
                int visit = scan.nextInt();
                scan.nextLine();
                library.add(new Book(title,author,visit));
            } else if (command.equals("L")) {
                if(library.isEmpty()) System.out.println("Library is empty");
                else {
                    for (Book b:library){
                        System.out.println(b);
                    }
                }
            }
        }
        scan.close();

        saveData();
    }


    public static void saveData(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(library);
            oos.close();
        } catch (FileNotFoundException e) {
            library = new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

