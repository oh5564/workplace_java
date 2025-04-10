package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken(); // 수
        int n = Integer.parseInt(st.nextToken()); //n진법
        int sum= 0;   
        for(int i=0;i<str.length();i++){
            if(str.charAt(str.length()-i-1)>='A'){ // A 이상일 때
                sum+=Math.pow(n, i)*(int)(str.charAt(str.length()-i-1)-'A'+10);
            }
            else{ // 숫자일 때
                sum+=Math.pow(n, i)*(int)(str.charAt(str.length()-i-1)-'0');
            }
        }
        System.out.println(sum);
    }
}
