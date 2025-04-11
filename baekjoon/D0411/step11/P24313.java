package baekjoon.D0411.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // n0보다 큰 모든 n에 대하여 f(n) <= c * g(n)인 양의 상수  c와 n0가 존재한다
        // f(n) =  a1 * n + a0 , g(n) = n
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        
        boolean isValid = true;
        for (int n = n0; n <= 100000; n++) { // n0부터 큰 n까지 확인
            if (a1 * n + a0 > c * n) {
                isValid = false;
                break;
            }
        }

        // 결과 출력
        System.out.println(isValid ? 1 : 0);
    }
}
