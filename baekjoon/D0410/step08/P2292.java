package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum =1;
        int count=1;
        while(true){
            if(n > sum) {
                sum+=count*6;
                count++;
            } else break;
        }
        System.out.println(count);
    }
}
