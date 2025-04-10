package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken()); // 상승
        double b = Double.parseDouble(st.nextToken()); // 하강
        double v = Double.parseDouble(st.nextToken()); // 총 높이
        double day = 1;
        day = (v-b)/(a-b);
        System.out.println((int)Math.ceil(day));
    }
}
