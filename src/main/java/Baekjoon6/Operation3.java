package Baekjoon6;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int n = a*2-1;
        for (int i = 1; i <=n/2+1; i++) {
            for (int j = i-1; j < i; j++) {
                for (int k = 0; k<(n-(j+i))/2; k++){
                    System.out.print(" ");
                }
                for (int k = 0; k < j + i; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        for (int i = n/2; i >= 1 ; i--) {
            for (int j = i-1; j < i; j++) {
                for (int k = 0; k<(n-(j+i))/2; k++){
                    System.out.print(" ");
                }
                for (int k = 0; k < j + i; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}
