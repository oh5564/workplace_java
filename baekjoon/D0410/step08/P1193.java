package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int sum = 1;
        int i = 1;
        int a = 1;
        int b = 1;
        while (true) {
            if (x >= sum && x < sum + i) { // 위치 찾음
                if (i % 2 == 0) { // 짝수번째 대각선일 때 오른쪽상단에서 왼쪽하단으로 움직임 a+b = i+1
                    b = i-(x-sum);
                    a = 1+(x-sum);
                    break;
                } else { // 홀수번째 대각선일 때 왼쪽하단에서 오른쪽 상단으로 움직임
                    a = i-(x-sum);
                    b = 1+(x-sum);
                    break;
                }
            } else {
                sum += i;
                i++;
            }

        }
        sb.append(a).append("/").append(b);
        System.out.println(sb);

    }
}
