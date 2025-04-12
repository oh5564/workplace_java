package baekjoon.D0412.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // ax+by>=n
        int a = 5;
        int b = 3;
        int x = n / a;
        int y = 0;
        for (int i = x; i >= 0; i--) {
            if(a*i+b*y ==n){ // n이면
                System.out.println(i);
                return;
            } else if ( a*i+b*y > n){ // n보다 크면
                continue;
            } else if (a*i+b*y < n) { // n보다 작으면
                while(true){
                    y++;
                    if(a*i+b*y==n){ // n이면
                        System.out.println(i+y);
                        return;
                    } else {
                        if(a*i+b*y > n){ // n보다 크면
                            break;
                        } // n 보다 작으면 루프문 반복
                    }
                }
            }

        }
        System.out.println("-1");
    }
}
