package Beakjoon6;

import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] chess = new int[6];
        for (int i = 0;i< chess.length; i++){
            chess[i] = scanner.nextInt();
        }
        output(chess);
        for (int k :chess){
            System.out.print(k+" ");
        }

    }public static int[] output(int[] chess) {
        for (int i = 0; i<chess.length; i++) {
            if (i<2){
                chess[i]=1-chess[i];
            } else if (i<5){
                chess[i]=2-chess[i];
            } else {
                chess[i]=8-chess[i];
            }
        }
     return chess;
    }
}
