package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); // n 의 약수중 k 번째로 작은수 
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                count++;
                if(count==k){
                    System.out.println(i);
                    return;
                }

            }
        }
           // k번째 약수가 없을 경우
           System.out.println(0);
    }
}

