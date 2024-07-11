package Baekjoon6;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a =scanner.nextLine();
        char[] A =a.toCharArray();

        int[] n = new int[26];
        int max = 0;
        int count = 0;
        int maxn = 0;
        for (int i = 0; i< A.length; i++){
            if (A[i]>='A'&& A[i]<='Z'){
                n[A[i] -'A']++;
            }else {
                n[A[i]-'a']++;
            }
        }
        for (int i = 0; i< n.length; i++){
            if (max<n[i]){
                max = n[i];
                maxn = i;
            }
        }
        for (int i = 0; i< n.length; i++){
            if (max==n[i]){
                count++;
            }
        }
        if (count==1){
            System.out.println((char)(maxn+65));
        }else {
            System.out.println("?");
        }
    }
}
