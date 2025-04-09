package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String str= br.readLine();
        for(int i=0;i<n;i++){  
            int temp = (int)str.charAt(i)-48;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
