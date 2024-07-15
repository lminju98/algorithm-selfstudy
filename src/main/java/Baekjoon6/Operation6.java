package Baekjoon6;

import java.util.Scanner;

public class Operation6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char[] Str = str.toCharArray();
        int count = 0;
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < Str.length; i++) {
            if (i < Str.length - 1) {
                String a = "" + Str[i] + Str[i + 1];
                boolean found = false;
                for (String s : arr) {
                    if (a.equals(s)) {
                        count++;
                        i++;
                        found = true;
                        break;
                    }
                }
                if (found) continue;
            }
            if (i < Str.length - 2) {
                String b = "" + Str[i] + Str[i + 1] + Str[i + 2];
                if ("dz=".equals(b)) {
                    count++;
                    i += 2;
                    continue;
                }
            }
            count++;

        }
        System.out.println(count);
    }
}