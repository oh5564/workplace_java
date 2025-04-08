package baekjoon.D0408.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b= Integer.parseInt(st.nextToken());
        int b1= b%10; // 1의 자리
        int b2= b%100-b1; // 10의 자리
        int b3= b-b2-b1;
        System.out.println(a*b1);
        System.out.println(a*b2/10);
        System.out.println(a*b3/100);
        System.out.println(a*b);
        br.close();
    }
    
}
