package Beakjoon3;

import java.util.Scanner;

public class Operation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();

        String getLong = getLong(l);
        System.out.println(getLong+"int");

    }
    public static String getLong(int l){
        String getLong = "";
        int countLong = l / 4;
        for (int i = 0; i<countLong; i++){
            getLong += "long ";
        }
        return getLong;
    }
}
