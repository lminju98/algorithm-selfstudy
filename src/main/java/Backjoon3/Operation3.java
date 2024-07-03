package Backjoon3;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int getSum = getSum(a);
        System.out.println(getSum);

    }
    public static int getSum(int a){
        int sum = 0;
        int getSum = 0;

        for (int i = 0; i<= a; i++){
            sum = i;
            getSum = getSum + sum;
        }
        return getSum;
    }
}
