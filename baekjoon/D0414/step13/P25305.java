package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 응시생 수
        int k = Integer.parseInt(st.nextToken()); // 받는 사람의 수
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int aux = i - 1;
            while (aux >= 0 && arr[aux] > temp) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
        System.out.println(arr[n-k]);
    }
}
