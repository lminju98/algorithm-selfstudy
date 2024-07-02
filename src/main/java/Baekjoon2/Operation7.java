package Baekjoon2;

import java.util.Scanner;

public class Operation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int getDice = getDice(a,b,c);
        System.out.println(getDice);
    }
    public static int getDice(int a,int b,int c){
        int getDice = 0;
        if (a == c && b == c){
            getDice = 10000+(a*1000);
        } else if (a==b && b!=c) {
            getDice = 1000+a*100;
        } else if (a==c && b!=c) {
            getDice = 1000+a*100;
        } else if (b==c && a!=b) {
            getDice = 1000+c*100;
        } else if (a!=b && b!=c) {
            if (a >= b && a>=c){
                getDice = a*100;
            }else if (b >= a && b >= c){
                getDice= b*100;
            }else {
                getDice = c*100;
            }
        }
        return getDice;
    }
}
