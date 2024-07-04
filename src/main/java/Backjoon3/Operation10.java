package Backjoon3;

import java.util.Scanner;

public class Operation10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String getStar = getStar(a);
        System.out.println(getStar);


    }
    public static String getStar(int a) {
        String getStar = "";
        for (int i = a; i>0; i--) {
            for (int n = 1; n < i; n++) {
                getStar += " ";
            }
            for (int x = a; x > i-1; x--) {
                getStar += "*";
            }
            getStar += "\n";
        }
        return getStar;
    }
}