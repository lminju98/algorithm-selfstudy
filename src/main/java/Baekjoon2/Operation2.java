package Baekjoon2;

import java.util.Scanner;

public class Operation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Score = scanner.nextInt();

        String getScore = getScore(Score);
        System.out.println(getScore);
    }
    public static String getScore(int score){
        String getScore ;

        if (score >= 90){
            getScore = "A";
        } else if (score >= 80){
            getScore = "B";
        } else if (score >= 70){
            getScore = "C";
        } else if (score >= 60){
            getScore = "D";
        } else {
            getScore = "F";
        }

        return getScore;
    }
}
