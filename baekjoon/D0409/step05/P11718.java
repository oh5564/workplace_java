package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str= br.readLine();
            if(str!=null)
            sb.append(str).append("\n");
            else
            break;
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
