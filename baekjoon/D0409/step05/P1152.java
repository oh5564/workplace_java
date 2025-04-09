package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sum=0;
        while(st.hasMoreTokens()){
            st.nextToken();
            sum++;
        }
        System.out.println(sum);
       

    }
}
