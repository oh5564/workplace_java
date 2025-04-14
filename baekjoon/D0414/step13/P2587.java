package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2587 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 5;
        int arr[] = new int[n];
        int sum = 0;
        int avg, mid = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        avg = sum / n;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int aux = i - 1;
            while (aux >= 0 && arr[aux] > temp) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
        sb.append(avg).append("\n").append(arr[(n + 1) / 2-1]);
        System.out.println(sb);
    }
}
