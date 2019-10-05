package main;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scan.nextLine().trim();
        char[] arr = s.toCharArray();
        int totalWeight = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = arr[i];
            totalWeight = totalWeight + a;


        }
        System.out.println("totalWeight of String is :" + totalWeight);

    }
}
