package Baekjoon6;

import java.util.Objects;
import java.util.Scanner;

public class Operation8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        int b;
        String c;
        double[] B = new double[20];
        String[] C = new String[20];
        for (int i = 0; i<20; i++){
               a = scanner.next();
             B[i] =scanner.nextDouble();
             C[i]= scanner.next();
        }
        double getGrade = getGrade(B,C);
        System.out.println(getGrade);

    }public static double getGrade(double[] B, String[] C){
        double getGrade =0;
        double temp = 0;
        double tempb = 0;
        for (int i = 0; i<20; i++){
            if (Objects.equals(C[i], "A+")){
                temp += (double)  (B[i] * 4.5);
            } else if (Objects.equals(C[i], "A0")){
                temp += (double) (B[i] * 4.0);
            } else if (Objects.equals(C[i], "B+")) {
                temp += (double) (B[i] * 3.5);
            } else if (Objects.equals(C[i], "B0")) {
                temp += (double)  (B[i] * 3.0);
            } else if (Objects.equals(C[i], "C+")) {
                temp += (double)  (B[i] * 2.5);
            } else if (Objects.equals(C[i], "C0")) {
                temp += (double)  (B[i] * 2.0);
            } else if (Objects.equals(C[i], "D+")) {
                temp += (double)  (B[i] * 1.5);
            } else if (Objects.equals(C[i], "D0")) {
                temp += (double)  (B[i] * 1.0);
            }else {
                temp += (double)  (B[i] * 0.0);
            }
        }

        for (int i = 0; i<20; i++){
            if (!Objects.equals(C[i], "P")){
                tempb += B[i];
            }
        }

        getGrade = temp/tempb;
        return getGrade;
    }
}
