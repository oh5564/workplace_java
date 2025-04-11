package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int first_x = arr[0][0], first_y = arr[0][1];
        int target_x = 0, target_y = 0;
        int same_count = 0, dif_count = 0; // 같은값 갯수
        int same_x = 0, same_y = 0; // 같은값의 x위치
        for (int i = 1; i < n; i++) {
            if (first_x == arr[i][0]) { // 값이 같을 경우
                same_count++;
                same_x = i;
            } else { // 값이 다를 경우
                dif_count++;
            }
        }
        if(dif_count==2){ // 둘다 다를 경우
            target_x=first_x;
        }
        else if (same_count == 1) { // 하나만 다르면
            for (int i = 1; i < n; i++) {
                if (i != same_x) {
                    target_x = arr[i][0];
                }
            }
        }
        same_count=0; dif_count=0; //초기화

        for (int i = 1; i < n; i++) {
            if (first_y == arr[i][1]) { // 값이 같을 경우
                same_count++;
                same_y = i;
            } else { // 값이 다를 경우
                dif_count++;
            }
        }
        if(dif_count==2){ // 둘다 다를 경우
            target_y=first_y;
        }
        else if (same_count == 1) { // 하나만 다르면
            for (int i = 1; i < n; i++) {
                if (i != same_y) {
                    target_y = arr[i][1];
                }
            }
        }  
        System.out.println(target_x+" "+ target_y);

    }
}
