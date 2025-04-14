package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 삽입정렬
        for (int i = 1; i < n; i++) {
            int temp = arr[i]; // 삽입할 값
            int aux = i - 1;
            while (aux >= 0 && arr[aux] > temp) { // 삽입할 위치 찾기

                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;

        }
        //버블정렬
        for (int i = 0; i < n; i++) {
            int old_arr[] = arr;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int i : arr) {
            sb.append(i).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }

}
