package baekjoon.D0415.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        // b*d 와 a*d+c*b의 최대 공약수를 구한다
        int res1 = (b * d);
        int res2 = ((a * d) + (c * b));
        int temp = 0;
        if (res1 <= res2) {
            temp = gcd(res1, res2);
        } else {
            temp = gcd(res2, res1);
        }

        sb.append(res2 / temp).append(" ").append(res1 / temp);
        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
