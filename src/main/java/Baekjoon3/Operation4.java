package Baekjoon3;

import java.util.Scanner;

public class Operation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int a=0;
        int b=0;

        int getSum = getSum(n,a,b,scanner);
        if (getSum==x){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    public static int getSum(int n, int a, int b, Scanner scanner){
        int getSum=0;
        for (int i = 0; i<n; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            getSum += a*b;

        }
        return getSum;
    }
}
