package Baekjoon2;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int getHour = getHour(a, b);
        int getMin = getMin(a, b);
        System.out.println(getHour+" "+getMin);


    }

    public static int getHour(int a, int b) {
        int getHour = a;

        if (a == 0) {
            if (b<45){
            getHour = 23;
          }
        }else {
            if(b<45){
            getHour -= 1;
        }
        }
        return getHour;
    }

    public static int getMin(int a, int b) {
        int getMin = 0;

        if (b > 45) {
            getMin = (b - 45);
        }else if (b < 45){
            getMin = (b + 15);
        }

        return getMin;
    }
}
