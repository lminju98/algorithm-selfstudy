package Baekjoon4;

import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] getArr = new int[a];

        int n = scanner.nextInt();
        getArr(scanner,getArr);
        for (int i = 0; i<getArr.length; i++)
            if (getArr[i]<n){
                System.out.print(getArr[i]+" ");
            }

    }
    public static void getArr(Scanner scanner,int[]getArr){
        for (int i = 0;i<getArr.length;i++){
            getArr[i]= scanner.nextInt();
        }
    }
}