package main;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.nextLine().trim();
        s = s.toUpperCase();
        char[] arr = s.toCharArray();
        int upperWeight = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = arr[i];
            upperWeight = upperWeight + a;


        }
        System.out.println("upperWeight of String is :" + upperWeight);

    }
}



