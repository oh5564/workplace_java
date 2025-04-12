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
        int x = n / a; // a의 갯수
        int y = 0; // b의 갯수
        for (int i = x; i >= 0; i--) {
                while(true){
                    if(a*i+b*y==n){ // n이면
                        System.out.println(i+y);
                        return;
                    } else {
                        if(a*i+b*y > n){ // n보다 크면
                            break;
                        } // n 보다 작으면 루프문 반복
                    }
                    y++;
                }
            

        }
        System.out.println("-1");
    }
}
