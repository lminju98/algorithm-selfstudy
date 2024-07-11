package Baekjoon3;

import java.util.Scanner;

public class Operation11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] getAb= new int[100];
        getAb(scanner,getAb);
        for(int k:getAb){
            if (k==0){
                break;
            }
        System.out.println(k);
        }
    }
    public static int[] getAb(Scanner scanner, int[]getAb){
        for (int i = 0;;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a==0 && b==0){
                break;
            }
            getAb[i] = a+b;
            }
        return getAb;
    }
}
