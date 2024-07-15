package Baekjoon6;

import java.util.Scanner;

public class Operation7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
        int count = 0;

        for (int i = 0; i< n; i++) {
            boolean[] temp = new boolean[26];
            arr[i] = scanner.next();
            char[] Arr = arr[i].toCharArray();
            boolean Temp= true;
            if (Arr.length==1){
                count++;
                continue;
            }
            for (int j = 1; j< Arr.length; j++){
                temp[Arr[0]-'a'] = true;
                if (Arr[j-1]!=Arr[j]){
                    if (temp[Arr[j]-'a']==true){
                        Temp = false;
                        break;
                    }else {
                        temp[Arr[j]-'a'] = true;
                    }
                }

            }
            if (Temp){
                count++;
            }

        }

        System.out.println(count);


    }
}
