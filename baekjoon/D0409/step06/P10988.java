package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        int result=1;
        for(int i=0; i<length/2;i++){
            if(str.charAt(i) != str.charAt(length-i-1)) result= 0;
        }
        System.out.println(result);
    }
}
