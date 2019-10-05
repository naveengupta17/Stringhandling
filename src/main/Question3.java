package main;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String s1 = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        char[] ar = s1.toCharArray();
        String s2 = "  ";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (arr[i] == ar[j]) {
                    s2 = s.replace(arr[i], '*');
                }
            }
        }


        System.out.println(s2);
    }
}


