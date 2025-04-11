package baekjoon.D0411.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10108 {
    public static char[][] wb_arr= {{'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'}};
    public static char[][] bw_arr= {{'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'},
                                    {'B','W','B','W','B','W','B','W'},
                                    {'W','B','W','B','W','B','W','B'}};
    public static int length=8;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = temp.charAt(j);
            }
        }
        for(int i=0; i<n;i++){ // 잘라지는 첫 위치 정하기 
            if(i+length>n){ // 못자를 경우
                break;
            } else{ // 범위 가능한경우
                for(int j=0; j<m;j++){
                    if(j+length>m){ // 못자를 경우
                        break;
                    } else { // 자를수 있는 경우
                        char[][] temp = new char[length][length]; // 
                        for(int p=i;p<i+length;p++){
                            for(int q=j;q<j+length;q++){
                                temp[p-i][q-j]=arr[p][q];
                            }
                        }
                       if( compare(temp) < min )
                       {
                            min = compare(temp);
                       }
                    }
                }


            }
        }
        System.out.println(min);
    }
    private static int compare(char[][] temp) {
        // TODO Auto-generated method stub
        int bw_count = 0;
        int wb_count = 0;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(bw_arr[i][j]!=temp[i][j]){
                    bw_count++;
                }
                if(wb_arr[i][j]!=temp[i][j]){
                    wb_count++;
                }
            }
        }
        return bw_count > wb_count ? wb_count : bw_count;
    }
}
