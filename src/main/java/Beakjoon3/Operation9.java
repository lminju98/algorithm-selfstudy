package Beakjoon3;

import java.util.Scanner;

public class Operation9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        String getStar = getStar(a);
        System.out.println(getStar);


    }
    public static String getStar(int a) {
        String getStar = "";
        for (int i = 1; i <=a; i++) {
            for (int n = 0; n < i; n++) {
                getStar += "*";
            }
            getStar += "\n";
        }
        return getStar;
    }
}
