package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// x의 최소 최대 y의 최소 최대 구하기
public class P9063 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a <min_x){
                min_x= a;
            }
            if(b <min_y){
                min_y= b;
            }
            if(a >max_x){
                max_x= a;
            }
            if(b>max_y){
                max_y= b;
            }
        }
        int result = (max_x-min_x)*(max_y-min_y);
        System.out.println(result);
    }
}
