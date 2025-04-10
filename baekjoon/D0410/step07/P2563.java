package baekjoon.D0410.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = 100; // 크기 100인 정사각형
        int length = 10; // 색종이의 길이
        int sum = 0;
        int[][] arr = new int[size][size];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    arr[x - 1 + j][y - 1 + k]++;
                }
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i][j]!=0) sum++;
            }
        }
        System.out.println(sum);
    }
}
