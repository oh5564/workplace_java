package baekjoon.D0418.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = fact(n) / (fact(n - k) * fact(k));
        System.out.println(result);
    }

    private static int fact(int n) {
        if(n==0) return 1;
        if (n <= 1)
            return n;

        else
            return n * fact(n - 1);
    }
}
