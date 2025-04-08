package baekjoon.D0408.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(br.readLine()); // 조리시간
        if(min+a >=60){ 
            int b = (min+a)/60; // hour 더해질것
            min = (min+a)-(60*b);
            if((hour+b)>=24){
                hour =  (hour+b) - 24;

            } else {
                hour = hour+b;
            }

        }
        else{
            min = min +a;
        }
        br.close();
        System.out.println(hour+" "+min);
    }
    
}
