package Baekjoon4;

import java.util.Scanner;

public class Operation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =0;
        int[] chulseok = new int[28];
        int[] getN = new int[30];

        for (int i = 0;i<chulseok.length; i++){
            n = scanner.nextInt();
            chulseok[i]=n;
            chulSeok(chulseok,n,getN);
        }

        for (int i = 0; i< getN.length;i++){
            if (getN[i]==0){
                System.out.println(i+1);
            }
        }
    }
    public static int[] chulSeok(int[] chulseok,int n,int[] getN){
        for (int i =0; i< getN.length; i++){
            if (i+1==n){
                getN[i]=1;
            }
        }
        return getN;
    }
}
