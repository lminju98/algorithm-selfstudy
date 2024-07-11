package Baekjoon5;

import java.util.Scanner;

public class Operation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 0;
        char[] S = null;
        String str = "";
        int t = scanner.nextInt();
        for (int i = 0; i<t; i++){
            r = scanner.nextInt();
            String s = scanner.next();
            S = s.toCharArray();
            for (int j = 0; j< S.length; j++){
                for (int k = 0; k<r; k++){
                    str += S[j];
                }
            }
            str += "\n";
        }
        System.out.println(str);
    }
}
