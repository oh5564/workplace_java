package baekjoon.D0408.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25304 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()); // 총액
        int n = Integer.parseInt(br.readLine()); // 갯수
        int sum = 0; //총액
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum+=a*b;
        }
        if(sum==x){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
