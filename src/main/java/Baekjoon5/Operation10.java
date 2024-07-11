package Baekjoon5;

import java.util.Scanner;

public class Operation10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = scanner.next().toCharArray();
        int sum = getSum(arr);
        System.out.println(sum);

    }public static int getSum(char[] arr){
        int sum=0;
        for (int i = 0; i< arr.length; i++) {
            char temp = arr[i];
            if (temp == 'A' || temp == 'B' || temp == 'C'){
                sum += 3;
            } else if (temp == 'D' || temp == 'E' || temp == 'F') {
                sum += 4;
            } else if (temp == 'G' || temp == 'H' || temp == 'I') {
                sum += 5;
            } else if (temp == 'J' || temp == 'K' || temp == 'L') {
                sum += 6;
            } else if (temp == 'M' || temp == 'N' || temp == 'O') {
                sum += 7;
            } else if (temp == 'P' || temp == 'Q' || temp == 'R' || temp =='S') {
                sum += 8;
            } else if (temp == 'T' || temp == 'U' || temp == 'V') {
                sum += 9;
            } else if (temp == 'W' || temp == 'X' || temp == 'Y' || temp == 'Z') {
                sum += 10;
            }
        }
        return sum;
    }
}

