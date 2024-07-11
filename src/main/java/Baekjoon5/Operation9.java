package Baekjoon5;

import java.util.Scanner;

public class Operation9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String b = scanner.next();

        char[] arrA = A.toCharArray();
        char[] arrB = b.toCharArray();
        int getA = getNum(arrA);
        int getB = getNum(arrB);


            System.out.println(getB>getA?getB:getA);
    }

    public static int getNum(char[] arrA) {
        int getNum = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (i == 0) {
                getNum += arrA[i]-'0';
            } else if (i == 1) {
                getNum += (arrA[i]-'0') * 10;
            } else if (i == 2) {
                getNum += (arrA[i]-'0') * 100;
            }
        }
        return getNum;
    }
}
