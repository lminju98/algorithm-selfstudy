package Baekjoon4;

import java.util.Scanner;

public class Operation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] getArr = new int[n];

        getArr(scanner,n,getArr);
        int getMax = getMax(getArr);
        int getMin = getMin(getArr);
        System.out.print(getMin+" "+getMax);

    }
    public static void getArr(Scanner scanner,int n,int[] getArr){
        for (int i = 0; i<getArr.length; i++){
            getArr[i] += scanner.nextInt();
        }
    }public static int getMax(int[] getArr){
        int getMax = -1000000;
        for (int i = 0;i<getArr.length;i++){
            if (getMax <=getArr[i]){
                getMax= getArr[i];
            }
        }
        return  getMax;
    }
    public static int getMin(int[] getArr){
        int getMin = 1000000;
        for (int i = 0;i<getArr.length;i++){
            if (getMin >=getArr[i]){
                getMin= getArr[i];
            }
        }
        return  getMin;
    }
}
