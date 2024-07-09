package Beakjoon3;

import java.util.Scanner;

public class Operation8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int[] getT = new int[t];

        getT(scanner, a, b, getT);

        for (int i = 0; i<getT.length; i++) {
            System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + getT[i]);
        }
    }

    public static int[] getT(Scanner scanner, int[] a, int[] b, int[]getT) {
        for (int i = 0; i<getT.length; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            getT[i] = a[i] + b[i];
        }
        return getT;
    }
}