package baekjoon.D0408.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class P14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int x= Integer.parseInt(br.readLine()); //x좌표
        int y= Integer.parseInt(br.readLine()); //y좌표
        if(x>0){
            if(y>0){ // x>0 , y<0 
                System.out.println("1");
            }
            else{ // x>0 , y<=0
                System.out.println("4");
            }
            
        } else { 
            if (y>0) { // x<=0 , y>0
                System.out.println("2");
            }
            else { // x<=0, y<=0
                System.out.println("3");
            }
        }

    }
    
}
