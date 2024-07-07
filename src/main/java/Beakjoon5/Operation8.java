package Beakjoon5;

import java.util.Arrays;
import java.util.Scanner;

public class Operation8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        String a = scanner.nextLine().trim();
        String[] arrA = a.split(" ");

        for (int i = 0; i< arrA.length; i++){
            if (arrA[i].isEmpty()){
                continue;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}