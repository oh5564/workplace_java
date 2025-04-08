package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        for(int i=0; i<m;i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = 0;
            temp=arr[a-1];
            arr[a-1]=arr[b-1];
            arr[b-1]=temp;
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
