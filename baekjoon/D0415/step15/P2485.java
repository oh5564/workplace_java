package baekjoon.D0415.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2485 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] temp = new int[n - 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i >= 1) {
                temp[i - 1] = arr[i] - arr[i - 1];
            }
        }

        // tmep의 최대 공약수 구하기
        int k = temp[0];
        for (int i = 1; i < n - 1; i++) {
            if (temp[i] >= k) {
                k = gcd(k, temp[i]);
            } else {
                k = gcd(temp[i], k);
            }
        }

        // arr 순회하면서 없는구간에 심어주기
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += ((arr[i] - arr[i - 1]) / k)-1;
        }
        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        if (b % a == 0)
            return a;
        return gcd(b % a, a);

    }
}
