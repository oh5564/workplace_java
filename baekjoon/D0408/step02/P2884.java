package baekjoon.D0408.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        if( min <45) {
            if( hour >=1 ){ 
                hour--;
            } else {
                hour = 24-1;
            }
        
            min = 60 +(min-45);
        } else{ 
            min -=45;
        }
        System.out.println(hour+" "+min);
        br.close();
    }
}
