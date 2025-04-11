package baekjoon.D0411.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24267 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long sum = 0;
        sum = (long) n * (n - 1) * (n - 2) / 6;
        sb.append(sum).append("\n").append("3");
        System.out.println(sb);

    }
}
