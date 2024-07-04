package Backjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Operation6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine());
        int[] results = new int[t];

        getT(reader, results);

        for (int i = 0; i < results.length; i++) {
            writer.write(results[i] + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }

    public static void getT(BufferedReader reader, int[] results) throws IOException {
        for (int i = 0; i < results.length; i++) {
            String[] input = reader.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            results[i] = a + b;
        }
    }
}