package Backjoon3;

import java.util.Scanner;

public class Operation12 {
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

            if (scanner.hasNext()){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                getAb[i] = a+b;
            }else {
                break;
            }

        }
        return getAb;
    }
}
