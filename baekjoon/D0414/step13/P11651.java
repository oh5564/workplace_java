package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11651 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 병합정렬
        arr = sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);

    }

    public static int[][] sort(int[][] arr) {
        if (arr.length < 2)
            return arr;

        int mid = arr.length / 2;
        int[][] low_arr = sort(Arrays.copyOfRange(arr, 0, mid));
        int[][] high_arr = sort(Arrays.copyOfRange(arr, mid, arr.length));

        int[][] mergedArr = new int[arr.length][2];
        int m = 0, l = 0, h = 0;
        int x = 1;
        int y = 0;
        while (l < low_arr.length && h < high_arr.length) {
            if (low_arr[l][x] < high_arr[h][x]) {
                mergedArr[m++] = low_arr[l++];
            } else if (low_arr[l][x] == high_arr[h][x]) {
                if (low_arr[l][y] < high_arr[h][y]) {
                    mergedArr[m++] = low_arr[l++];
                } else {
                    mergedArr[m++] = high_arr[h++];
                }
            } else
                mergedArr[m++] = high_arr[h++];
        }
        while (l < low_arr.length) {
            mergedArr[m++] = low_arr[l++];
        }
        while (h < high_arr.length) {
            mergedArr[m++] = high_arr[h++];
        }
        return mergedArr;
    }
}