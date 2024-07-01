package Baekjoon2;

import java.util.Scanner;

public class Operation4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        int getInt = getInt(a,b);
        System.out.println(getInt);
    }
    public static int getInt(int a,int b){
        int getInt;

        if (a>0 && b>0){
            getInt = 1;
        }else if(a<0 && b>0) {
            getInt = 2;
        }else if(a<0 && b<0) {
            getInt = 3;
        }else {
            getInt = 4;
        }
        return getInt;

    }
}
