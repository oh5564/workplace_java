package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = m;
        loop: for (int i = n; i <= m; i++) {
            if(i==1) continue loop;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            sum += i;
            if (min > i) {
                min = i;
            }
        }
        if (sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
