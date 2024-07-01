package Baekjoon2;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        int getYear = getYear(year);
        System.out.println(getYear);
    }
    public static int getYear(int year){
        int leapyear ;

        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapyear = 1;
        }else{
            leapyear = 0;
        }
        return leapyear;
    }
}
