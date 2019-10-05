package main;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String s1 = "aeiouAEIOU";
        int c = 0;
        char[] arr = s.toCharArray();
        char[] ar = s1.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {

                if (arr[i] == ar[j]) {
                    if (c == 0) {
                        s = s.replaceFirst(String.valueOf(arr[i]), "*");
                        c = c + 1;

                    } else if (c == 1) {
                        s = s.replaceFirst(String.valueOf(arr[i]), "^");
                        c = c + 1;
                    } else if (c == 2) {
                        s = s.replaceFirst(String.valueOf(arr[i]), "!");
                        c = 0;
                    }

                }
            }
        }


        System.out.println(s);
    }
}

