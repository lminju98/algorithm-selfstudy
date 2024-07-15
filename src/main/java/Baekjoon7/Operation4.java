package Baekjoon7;

import java.util.Scanner;

public class Operation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] N = new int[n][2];
        int[][] input = new int[100][100];


        for (int i = 0; i<n; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            for (int j =a; j<a+10; j++){
                for (int k =b; k<b+10; k++){
                input[j][k]=1;
                }
            }
        }
        int count=0;
        for (int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(input[i][j]>0){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
