package Baekjoon4;

import java.util.Scanner;

public class Operation8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] getN = new int[10];
        int n=0;
        for (int i =0; i< getN.length;i++){
            n= scanner.nextInt();
            getN[i] = n;
            getN(getN);
        }
        int count = count(getN);
        System.out.println(count);

    }
    public static int[] getN(int[] getN){
        for (int i=0; i<getN.length; i++){
            getN[i]= getN[i]%42;
        }
        return getN;
    }
    public static int count(int[] getN){
        int count1 = 0;
        for (int j =0; j<getN.length; j++){
            int count = 0;
            for (int i =j+1; i< getN.length; i++){
                if (getN[i]==getN[j]){
                    count ++;
                }
            }
            if (count ==0){
                count1++;
            }
        }

        return count1;

    }
}
