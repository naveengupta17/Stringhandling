package main;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.nextLine().trim();
        s = s.toUpperCase();
        char[] arr = s.toCharArray();
        int upperWeight = 0;
        int lowerWeight = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = arr[i];
            upperWeight = upperWeight + a;
        }
        s = s.toLowerCase();
        char[] arr1 = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            int b = arr1[j];
            lowerWeight = lowerWeight + b;

        }
        int absoluteWeight = upperWeight - lowerWeight;
        System.out.println("absoluteWeight of String is :" + Math.abs(absoluteWeight));

    }

}
