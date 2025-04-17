package baekjoon.D0417.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17103 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int max = 1000000;
        boolean[] isPrime = new boolean[max + 1];
        
        // 에라토스테네스의 체로 소수 미리 계산
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= a / 2; j++) {
                if (isPrime[j] && isPrime[a - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
