package Baekjoon5;

import java.util.Scanner;

public class Operation6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] getNum = new int[26];
        String baekjoon = scanner.next();

        getNum(getNum,baekjoon);
        for (int k:getNum) {
            System.out.print(k+" ");
        }

    }
    public static int[] getNum(int[] getNum,String baekjoon){
        for (int i = 0; i< getNum.length; i++){
            getNum[i] = -1;
        }
        for (int i = 0; i<baekjoon.length(); i++){
            char c= baekjoon.charAt(i);
            for (int j = 'a'; j<='z'; j++){
                if (c==j){
                    if (getNum[j-'a']==-1) {
                        getNum[j -'a'] = i;
                    }
                }
            }
        }
        return getNum;
    }
}
