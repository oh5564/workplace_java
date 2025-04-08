package baekjoon.D0408.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2439 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                sb.append(" ");
            }
            for(int k=n-i;k>=0;k--){
                sb.append("*");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
