package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int[] arr = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]) max =arr[i];
        }
        int[] count = new int[max+1];
        for (int i : arr) {
            count[i]++;
        }
        for(int i=0; i<max;i++){
            count[i+1]+=count[i];
        }
        for(int i = 0; i<n;i++){
            res[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for (int i : res) {
            sb.append(i).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
