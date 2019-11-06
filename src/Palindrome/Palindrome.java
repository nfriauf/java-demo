package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Type a string");
        Scanner inputScanner = new Scanner(System.in);
        String original;
        String reverse = new String();
        original = inputScanner.nextLine();
        original = original.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        //System.out.println(reverse);

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }

}
