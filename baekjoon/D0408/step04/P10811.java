package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public interface P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken()); // 바구니 수
        int m = Integer.parseInt(st.nextToken()); // 옮기는 수
        int arr[]= new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b =Integer.parseInt(st.nextToken());    
            int k=0;
            for(int j =a-1; j<(a+b-1)/2;j++){
                int temp = 0;
                k++;
                temp=arr[j];
                arr[j]=arr[b-k];
                arr[b-k]=temp;
            }
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
