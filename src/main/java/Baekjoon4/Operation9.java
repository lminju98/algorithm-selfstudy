package Baekjoon4;

import java.util.Scanner;

public class Operation9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] baguni = new int[n];
        for (int i =0;i<baguni.length; i++){
            baguni[i]=i+1;
        }
        int m = scanner.nextInt();
        for (int x =0;x<m; x++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            baguni(baguni,i,j);
        }

        for (int k:baguni){
            System.out.print(k+" ");
        }
    }public static int[] baguni(int[] baguni,int i, int j){
        for (int x = i-1; x<j; x++){
            for (int y = x+1 ; y<j; y++){
                int temp = baguni[x];
                baguni[x]= baguni[y];
                baguni[y] = temp;
            }
        }
        return baguni;
    }
}
