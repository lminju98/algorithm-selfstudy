package basic;

import java.util.Scanner;


/**
 *
 */

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        int getYear = getYear(y);
        System.out.println(getYear);
    }

    public static int getYear(int y){

        if (y >=1000 && y<=3000){
            y= (y-543);
        }
        return y;
    }
}
