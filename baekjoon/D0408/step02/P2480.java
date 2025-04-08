package baekjoon.D0408.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0; // 상금
        if( a == b && b == c){ //셋 다 같은경우
            sum = 10000+(a*1000);
        } else if ( a == b || a == c){ // a랑 b 또는 c랑 같은경우
            sum = 1000+(a*100);
        } else if ( b == c ) { // b랑 c가 같은경우
            sum = 1000+(b*100);
        } else {
            sum= Math.max(a,Math.max(b,c))*100;
        }
        System.out.println(sum);

    }
    
}
