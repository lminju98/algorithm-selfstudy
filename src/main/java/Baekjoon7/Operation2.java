package Baekjoon7;

import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int[][] a = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int I = 0;
        int J = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] >= max) {
                    max = a[i][j];
                     I = i+1;
                     J = j+1;
                }
            }
        }
        System.out.println(max+"\n"+I+" "+J);
    }
}
