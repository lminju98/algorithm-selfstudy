package Beakjoon5;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] getSum = new String[n];

        char[] b = null;
        String a = scanner.next();
        for (int i = 0; i < getSum.length; i++) {
            getSum[i] = a;
            b = a.toCharArray();
        }

        int getNum = getSum(b);
        System.out.println(getNum);


    }public static int getSum(char[] b){
        int getNum=0;
        for (int i = 0; i<b.length; i++){
            getNum += b[i]-'0';
        }
        return getNum;
    }
}
