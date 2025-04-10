package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9506 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = " is NOT perfect.";
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1)
                break;
            else {
                int[] arr = new int[n];
                int count = 0;
                int sum = 0;
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        arr[count] = i;
                        count++;
                    }
                }
                for (int i : arr) {
                    sum += i;
                }
                if (sum == n) { // 완전수 일 때
                    sb.append(n).append(" = ");
                    for (int i : arr) {
                        if (i != 0) {
                            sb.append(i).append(" + ");
                        }

                    }
                    sb.setLength(sb.length() - 3);
                    sb.append("\n");
                } else {
                    sb.append(n).append(str).append("\n");
                }
            }
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
