package lab2.Task1.SuperAndSubclasses;

import java.util.HashSet;

public class AppTest {
    public static void main(String[] args) {
        HashSet<BookCase> bookCases = new HashSet<>();
        BookCase b1 = new BookCase("Wood",30,2,4,"wall-mounted");
        BookCase b2 = new BookCase("Metal",60,2,4,"built-in ");
        BookCase b3 = new BookCase("Plastic",15,2,4,"ladder");
        bookCases.add(b1);
        bookCases.add(b2);
        bookCases.add(b3);


        for(BookCase b: bookCases){
            System.out.println(b);
        }
    }
}
