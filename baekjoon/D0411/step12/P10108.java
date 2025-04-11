package baekjoon.D0411.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = temp.charAt(j);
            }
        }
        for(int i=0; i<n;i++){ // 잘라지는 첫 위치 정하기 
            if(i+7>=n){ // 못자를경우
                break;
            } else{


            }
            for(int j=0;j<m;j++){
                if( j+7>=m){ // 못자를경우

                }

            }
        }
    }
}
