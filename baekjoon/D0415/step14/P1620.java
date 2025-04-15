package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> reverseMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map.put(i, name);
            reverseMap.put(name, i);
        }
        // 숫자인지 문자인지 판별
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (temp.chars().allMatch(Character::isDigit)) { // 숫자인 경우
                int key = Integer.parseInt(temp);
                sb.append(map.get(key)).append("\n");
            } else { // 문자인 경우
                sb.append(reverseMap.get(temp)).append("\n");
            }
        }

        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
