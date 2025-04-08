package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken()); // 배열 크기
        int x = Integer.parseInt(st.nextToken()); // x보다 작은 배열 구하기
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp <x) sb.append(temp).append(" ");

        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
    
}
