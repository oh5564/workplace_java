package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2903 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum=4;
        for(int i =1; i<=n;i++){
            sum+=sum+sum-Math.sqrt(sum)+sum-Math.sqrt(sum)+sum-(Math.sqrt(sum)*2-1)-sum;
        }
        System.out.println(sum);
    }
}
