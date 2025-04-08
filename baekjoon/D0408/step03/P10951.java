package baekjoon.D0408.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        StringBuilder sb =new StringBuilder();
        while ( (temp = br.readLine()) !=null){
            StringTokenizer st = new StringTokenizer(temp);
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
