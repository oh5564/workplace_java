package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003 {
    public static void main(String[] args) throws IOException {
        // 16개의 피스, 킹1 퀸1 록2 비숍2 나이트2 폰 8
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int n=6;
        int arr[] = new int[n];
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n;i++){
            switch (i) {
                case 0: case 1: res[i]=1-arr[i]; break;
                case 2: case 3: case 4 : res[i] =2-arr[i]; break;
                case 5: res[i] = 8-arr[i]; break;  
            }
        }
        for (int i : res) {
            sb.append(i).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);

    }
}
