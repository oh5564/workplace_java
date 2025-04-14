package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int aux = i - 1;
            while (aux >= 0 && arr[aux] < temp) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
        for (int i : arr) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
