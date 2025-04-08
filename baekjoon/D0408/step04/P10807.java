package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P10807 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        for (int j : arr) {
            if(v==j) sum++;
        }
        System.out.println(sum);
        
    }
}
