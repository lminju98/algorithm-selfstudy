package Baekjoon6;

import java.util.Scanner;

public class Operation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        char[] A = a.toCharArray();
        int B = 0;
        for (int i = 0; i< A.length; i++){
            if (A[i]==A[(A.length-1)-i]){
                B=1;
            } else {
                B=0;
                break;
            }
        }
        System.out.println(B);
    }
}
