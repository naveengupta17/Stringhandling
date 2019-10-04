package main;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String and last index of Substring ");
        String s = scan.nextLine().trim();
        int n = scan.nextInt();
        System.out.println(s.substring(0, n));
        scan.close();
    }
}
