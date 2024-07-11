package Baekjoon5;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        String[] getStr= new String[b];

        for (int i =0; i< getStr.length; i++) {
            getStr[i] = scanner.next();
        }

        for (int i = 0; i< getStr.length; i++){
            char[] a=getStr[i].toCharArray();
            if (a.length>0) {
                System.out.print(a[0]);
                System.out.println(a[a.length - 1]);
            }
        }

    }
}
