package baekjoon.D0408.step01;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class P18108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        System.out.println(a-543);
        br.close();

    }
    
}
