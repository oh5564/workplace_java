package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int r = Integer.parseInt(st.nextToken()); //반복횟수
            String str = st.nextToken();
            for(int j=0;j<str.length();j++){ //문자수만큼 반복
                for(int k=0; k<r;k++){ // 문자를 k번 저장
                    sb.append(str.charAt(j)); //j에 위치한 문자 저장
                }
                
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
