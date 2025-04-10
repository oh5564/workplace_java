package baekjoon.D0410.step07;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        int m = 15;
        int max = Integer.MIN_VALUE;
        char[][] arr = new char[n][m];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            max = Math.max(max, temp.length());
            for (int j = 0; j < temp.length(); j++) {
                arr[i][j] = temp.charAt(j);
            }

        }
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < n; i++) {
                if (arr[i][j] != '\0') {
                    sb.append(arr[i][j]);
                }
            }
        }
        System.out.println(sb);
    }
}
