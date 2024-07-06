package Baekjoon4;

import java.util.Scanner;

public class Operation10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] getScore = new int[n];
        double sum = 0.0;
        for (int i = 0; i< getScore.length; i++){
            getScore[i] = scanner.nextInt();
            sum += getScore[i];
        }

        double getAvg = getAvg(getScore,sum,n);
        System.out.println(getAvg);

    }public static double getAvg(int[] getScore,double sum,int n){
            int maxScore = 0;
            double avg=0.0;
        for (int i = 0; i<getScore.length; i++){
            if (maxScore < getScore[i]){
                maxScore = getScore[i];
            }
        }
        avg = sum/n/maxScore*100;
        return avg;
    }
}
