package main;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.nextLine().trim();
        System.out.println("Enter the substring to replace :");
        String s1 = scan.nextLine().trim();
        String s2 = s.replaceAll(s1, "#replaced");
        System.out.println(s2);


    }
}
