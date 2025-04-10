package baekjoon.D0410.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 9;
        int[][] arr = new int[n][n];
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max)
                {
                    max = arr[i][j];
                    x=i+1;
                    y=j+1;
                }
                    
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
