package baekjoon.D0418.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            // mCn 구하기
            long a = 1;
            int k = 1;
            for (int j = m; j >= m - n + 1; j--) {
                a *= j;
                if (k <= n) {
                    a /= k++;

                }
            }
            while (k <= n) {
                a = a / k;
                k++;
            }
            sb.append(a).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

}
