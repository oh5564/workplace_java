package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15894 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(4);
            return;

        }
        long sum = 4;
        for (int i = 2; i <= n; i++) { // 5는 양 끝에 생기는 사각형, (i-1)은 그전의 맨 밑변 빼기, 1*(i-2)는 맨밑에 추가되는 양끝 사이에있는 사각형
            sum+= 5-(i-1)+1*(i-2);
        }

        System.out.println(sum);
    }
}
