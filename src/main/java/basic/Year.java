package basic;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        int getYear = getYear(year);
        System.out.println(getYear);
    }

    public static int getYear(int year){

        if (year == year ){
            year = (year-543);
        }

        return year;
    }
}
