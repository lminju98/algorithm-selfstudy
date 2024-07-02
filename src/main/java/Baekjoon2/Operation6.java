package Baekjoon2;

import java.util.Scanner;

public class Operation6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        String getMin = getMin(a,b,c);
        System.out.println(getMin);

    }
    public static String getMin(int a, int b, int c){
        int getMin = 0;
        int getMina = 0;
        int getHour = 0;
        getMin = (b+c)/60;
        getMina = (b+c)%60;
        int gethour = a+getMin;
        if (gethour>=24){
            gethour =gethour-24;
        }

        return gethour+" "+getMina;
    }
}
