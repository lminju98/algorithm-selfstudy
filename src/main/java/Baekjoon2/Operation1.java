package Baekjoon2;

import java.util.Scanner;

public class Operation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        String getOpration = getOperation(A,B);
        System.out.println(getOpration);


    }
    public static String getOperation(int A, int B){
        String getOperation = "";
        if (A>B) {
            getOperation = ">";
        }else if (A<B){
            getOperation = "<";
            }else{
            getOperation = "==";
        }
        return getOperation;
    }
}
