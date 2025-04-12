package baekjoon.D0412.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int number = 666;
        while (true) {
            String str = String.valueOf(number);
            if (str.contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }

    }
}
