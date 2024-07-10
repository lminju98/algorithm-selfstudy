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
        int K = 1;
        int L = 2;
        int P = 8;
        for (int i = 0; i<chess.length; i++) {
            if (i==0){
                chess[0]=K-chess[0];
            }else if (i==1){
                chess[1]=K-chess[1];
            }else if (i==2){
                chess[2]=L-chess[2];
            }else if (i==3){
                chess[3]=L-chess[3];
            }else if (i==4){
                chess[4]=L-chess[4];
            }else if (i==5){
                chess[5]=P-chess[5];
            }
        }
     return chess;
    }
}
