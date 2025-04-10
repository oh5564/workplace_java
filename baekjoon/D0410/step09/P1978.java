package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            int a = Integer.parseInt(st.nextToken());
            if (a == 0)
                continue;
            else {
                for (int j = 1; j <= a; j++) {
                    if (a % j == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    sum++;
            }

        }
        System.out.println(sum);
    }
}
