package baekjoon.D0408.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10950 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 시행횟수
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append(b+c).append("\n");
        }
        br.close();
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
