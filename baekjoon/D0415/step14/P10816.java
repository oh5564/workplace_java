package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P10816 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>(); // key - 숫자 , value - 가진 갯수
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (map.containsKey(temp)) { // 이미 있으면
                map.put(temp, map.get(temp) + 1);
            } // 처음이면
            else {
                map.put(temp, 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<m;i++){
            int temp = Integer.parseInt(st.nextToken());
            sb.append(map.get(temp) == null ? 0 : map.get(temp)).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
