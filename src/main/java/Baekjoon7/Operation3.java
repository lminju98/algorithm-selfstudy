package Baekjoon7;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] A = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String n = scanner.nextLine();
            char[] a = n.toCharArray();
            for (int j = 0; j < 15; j++) {
                if (j >= a.length) {
                    A[i][j] = ' ';
                } else {
                    A[i][j] = a[j];
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[j][i]!=' '){
                    System.out.print(A[j][i]);
                }
            }
        }
    }
}
