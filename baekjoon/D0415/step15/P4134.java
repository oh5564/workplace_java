package baekjoon.D0415.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4134 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Long a = Long.parseLong(br.readLine());
            if (a<=1) {
                sb.append("2\n");
                continue;
            }
            while (true) {
                for (long k = 2; k * k <= a; k++) {
                    if (a % k == 0) {
                        a++;
                        k = 1;
                    }
                }
                sb.append(a).append("\n");
                break;

            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
