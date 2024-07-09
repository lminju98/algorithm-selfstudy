package Beakjoon3;

import java.util.Scanner;

public class Operation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] getT = new int[t];
        getT(scanner,getT);

        for (int i = 0; i<getT.length; i++){
            System.out.println("Case #"+(i+1)+": "+getT[i]);
        }

    }
    public static void getT(Scanner scanner, int[]getT){

        for (int i = 0; i<getT.length; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            getT[i] = a+b;
        }
    }
}