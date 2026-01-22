package OOP_2026.practice.practice1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        isPalindrome(word);
        scan.close();
    }

    public static void isPalindrome(String word){
        String reverseWord = "";
        for(int i = 0; i < word.length(); i++){
            reverseWord = word.charAt(i) + reverseWord  ;
        }
        if(word.equals(reverseWord)){
            System.out.println("it`s palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
