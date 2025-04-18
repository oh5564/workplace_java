package baekjoon.D0418.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==0){
            System.out.println(1);
            return;
        }
        int result = fact(n);
        System.out.println(result);
    }

    private static int fact(int n) {
        if (n <= 1)
            return n;
        else
        return n * fact(n - 1);
    }
}
