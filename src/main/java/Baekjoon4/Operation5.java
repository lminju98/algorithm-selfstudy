package Baekjoon4;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] getBaguni = new int[n];
        getBaguni(scanner, getBaguni);

        for (int k:getBaguni){
            System.out.print(k+" ");
        }

    }
    public static int[] getBaguni(Scanner scanner, int[]getBaguni){
        int m = scanner.nextInt();
        for (int x = 0; x<m;x++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            for (int y = 0; y<getBaguni.length; y++){
                if (y>=i-1 && y<=j-1){
                    getBaguni[y] = k;
                }
            }
        }
        return getBaguni;
    }
}
