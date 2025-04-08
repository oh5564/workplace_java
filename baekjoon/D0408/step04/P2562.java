package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=9;
        int target =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp > max) 
                {
                    max = temp; 
                    target= i+1;
                }
        }
        System.out.println(max+"\n"+target);
    }
}
