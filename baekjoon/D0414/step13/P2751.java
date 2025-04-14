package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2751 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = sort(arr);
        for (int i : arr) {
            sb.append(i).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    // 병합 정렬
    public static int[] sort(int[] arr) {
        if (arr.length < 2)
            return arr;

        int mid = arr.length / 2;
        int[] low_arr = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] high_arr = sort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] mergedArr = new int[arr.length];
        int m = 0, l = 0, h = 0;
        while (l < low_arr.length && h < high_arr.length) {
            if (low_arr[l] < high_arr[h]) {
                mergedArr[m++] = low_arr[l++];
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
