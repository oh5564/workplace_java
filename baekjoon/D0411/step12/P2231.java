package baekjoon.D0411.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int j = i;
            int sum=i;
            while (j!=0) {
                sum+=j%10;
                j = j/10;
            }
            if(sum==n) {
                System.out.println(i);
                return;
            }

        }
        System.out.println("0");

    }
}
