package Baekjoon5;

import java.util.Scanner;

public class Operation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int b = scanner.nextInt();
        if (b>0 && b<= a.length()){
            System.out.println(a.charAt(b-1));
        }
    }
}
