package baekjoon.D0408.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2753 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        if( a%4==0){ // 4의 배수이면서
            if(a%100 != 0){ // 100의 배수가 아닐 때
                System.out.println("1");
            }
            else if (a%400 == 0 ) { //400의 배수일 때
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
        br.close();
        
    }
    
}
