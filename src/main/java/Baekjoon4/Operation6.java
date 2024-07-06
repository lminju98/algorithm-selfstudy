package Baekjoon4;

import java.util.Scanner;

public class Operation6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int m= scanner.nextInt();
        int[] baguni = new int[n];
        baguni(baguni);

        for (int x=0; x<m; x++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            swapBaguni(baguni,i,j,m);
        }
        for (int k:baguni){
            System.out.print(k+" ");
        }
    }
    public static int[] baguni(int[] baguni){
        for (int i =0; i< baguni.length ;i++){
            baguni[i] = i+1;
        }
        return baguni;
    }
    public static void swapBaguni(int[] baguni,int i, int j,int m){
            int temp=baguni[i-1];
            baguni[i-1]=baguni[j-1];
            baguni[j-1]=temp;
    }
}
