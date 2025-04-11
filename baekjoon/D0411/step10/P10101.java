package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10101 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        int c= Integer.parseInt(br.readLine());
        if(a+b+c!=180){
            System.out.println("Error");
        } else{
            if(a==b || a==c){ // a와b가 같은경우
                if( b==c) { // 셋다 같은경우
                    System.out.println("Equilateral");
                }
                else if( b!=c){ //두개 같은경우
                    System.out.println("Isosceles");
                }

            } else if( b==c) {
                if( a==c) { // 셋다 같은경우
                    System.out.println("Equilateral");
                }
                else if( a!=b){ //두개 같은경우
                    System.out.println("Isosceles");
                }
            }
            else { // 같은각이 없는 경우
                System.out.println("Scalene");
            }
        }
    }
}
