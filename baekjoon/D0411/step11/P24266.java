package baekjoon.D0411.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P24266 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(n*n*n).append("\n").append("3");
        System.out.println(sb);
    }
}
