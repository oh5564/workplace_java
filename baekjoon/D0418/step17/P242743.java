package baekjoon.D0418.step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P242743 {
    public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine()); 
       System.out.println((int)Math.pow(2, n));
    }
}
