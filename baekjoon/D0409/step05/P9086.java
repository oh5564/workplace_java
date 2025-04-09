package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9086 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int start = 0;
        for(int i=0;i<t;i++){
            String temp = br.readLine();
            sb.append(temp.charAt(start)).append(temp.charAt(temp.length()-1)).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
