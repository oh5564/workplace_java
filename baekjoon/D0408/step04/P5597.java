package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 28;
        int arr[] = new int[n+2];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(br.readLine());
            arr[a-1]++;
        }

        for(int i=0;i<n+2;i++){
            if(arr[i]==0){
                sb.append(i+1).append("\n");
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
