package baekjoon.D0415.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2948 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        while(true){
            int temp = Integer.parseInt(br.readLine());
            int sum=0;
            if(temp==0) break;
            // n보다 크고 2n보다 작거나 같은 소수의 개수
            loop:
            for(int i=temp+1;i<=2*temp;i++){
                for(int j =2;j*j<=i;j++){
                    if(i%j==0){
                        continue loop;
                    }
                }
                sum++;
            }
            sb.append(sum).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
