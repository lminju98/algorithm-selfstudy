package Baekjoon4;

import java.util.Scanner;

public class Operation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int getCount = getV(scanner);
        System.out.println(getCount);
    }
    public static int getV(Scanner scanner){
        int getCount=0;
        int n = scanner.nextInt();
        int[] getV = new int[n];

        for (int i = 0;i<getV.length;i++){
            getV[i]= scanner.nextInt();
        }
        int v =scanner.nextInt();
        for (int i = 0; i<getV.length;i++){
            if (v==getV[i]){
                getCount += 1;
            }
        }return getCount;
    }
}
