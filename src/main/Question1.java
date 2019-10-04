package main;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = input.nextLine().trim();
        int a = s.length();
        char[] array = new char[a];
        s.getChars(0, a, array, 0);
        System.out.print("index:");
        for (int i = 0; i <= (a - 1); i++) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
        System.out.print("chars:");
        for (int j = 0; j <= (a - 1); j++) {


            System.out.print(array[j] + "\t");
        }


        input.close();
    }
}

