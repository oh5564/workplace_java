package baekjoon.D0417.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface P13909 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //창문, 사람수
        System.out.println((int)Math.sqrt(n));
    }
}
