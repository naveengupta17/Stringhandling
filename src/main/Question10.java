package main;


import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        System.out.println("enter the string :");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        System.out.println("enter the character :");
        char s1 = scan.nextLine().charAt(0);
        System.out.println(s.indexOf(s1));
    }

}
