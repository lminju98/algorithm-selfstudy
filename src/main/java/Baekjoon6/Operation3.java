package Baekjoon6;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {

            //1/4
            for(int j = 0; j < n; j++) {
                if(j < ((n - i) - 1)) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            //2/4
            for(int j = 0; j < (n-1); j++) {
                if(j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        for(int i = 0; i < n-1; i++) {

            //3/4
            for(int j = 0; j < n-1; j++) {
                if(j < i+1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }



            //4/4
            for(int j = 0; j < n-1; j++) {
                if(j < ((n - i) - 1)) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }

    }
}
