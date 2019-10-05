package main;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("enter the string :");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        int c = -1;
        int a = 0;
        System.out.println("enter the character :");
        char s1 = scan.nextLine().charAt(0);
        for (int i = 0; i < s.length(); i++) {


            a = s.indexOf(s1, c + 1);
            c = a;
            if (a == i) {
                System.out.println(a);
            }

        }


    }
}









