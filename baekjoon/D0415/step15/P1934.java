package baekjoon.D0415.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // result = a*b/uclid(a,b); 유클리드
            int p = a, q = b;
            while (a != 0) {
                int r = b % a;
                b = a;
                a = r;
            }
            int result = p * q / b;
            sb.append(result).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static int uclid(int a, int b) { //
        if (b % a == 0)
            return a;
        return uclid(b % a, a);

    }
}
