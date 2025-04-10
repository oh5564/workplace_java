package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        char ar[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        // A 아스키코드 65
        while (n != 0) {
            int temp = n % b;
            if (temp >= 10) {
                sb.append(ar[temp-10]);
            } else {
                sb.append(temp);
            }
            n /= b;
        }
        sb.reverse();
        System.out.println(sb);
    }
}
