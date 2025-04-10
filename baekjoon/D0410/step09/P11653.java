package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11653 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(n==1) return;

        for(int i=2;(i*i)<=n;i++){
            while( n % i == 0 ){
                sb.append(i).append("\n");
                n /= i;
            }
        }

        if(n>1){
            sb.append(n).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);

      
    }
}
