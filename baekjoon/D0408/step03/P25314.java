package baekjoon.D0408.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i+=4){
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);  
    }
}
