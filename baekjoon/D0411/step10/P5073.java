package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        loop: while (true) {
           StringTokenizer st = new StringTokenizer(br.readLine());
            int n = 3;
            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            int max_p = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] == 0)
                    break loop;
                if (arr[i] > max) {
                    max = arr[i];
                    max_p = i;
                }
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (i != max_p) {
                    sum += arr[i];
                }
            }
            if (max >= sum) { // 삼각형이 안된다면
                sb.append("Invalid").append("\n");
            } else {
                if (arr[0] == arr[1] || arr[0] == arr[2]) // 두변의 길이가 같다면
                {
                    if( arr[1] == arr[2]) { // 세변의 길이가 같다면
                        sb.append("Equilateral").append("\n");
                    } else if ( arr[1] !=arr[2]){ //두 변의 길이만 같다면
                        sb.append("Isosceles").append("\n");
                    }
                }
                else if ( arr[1] == arr[2]) {
                    if( arr[0] == arr[1]) { // 세변의 길이가 같다면
                        sb.append("Equilateral").append("\n");
                    } else if ( arr[0] !=arr[1]){ //두 변의 길이만 같다면
                        sb.append("Isosceles").append("\n");
                    }

                } else { // 세변의 길이가 모두 다른경우
                    sb.append("Scalene").append("\n");
                }
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
