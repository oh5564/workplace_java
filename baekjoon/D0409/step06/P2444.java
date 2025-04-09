package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2444 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){ // 위쪽 피라미드
            for(int j=i; j<n-1;j++){
                sb.append(" ");
            }
            for(int k =0; k<i*2+1;k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=0;i<n-1;i++){ //아래 피라미드
            for(int j=0; j<=i;j++){
                sb.append(" ");
            }
            for(int k =(n-i-1)*2-1; k>0; k--){
                sb.append("*");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
    
}
