package baekjoon.D0418.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P20920 {
    public static void main(String[] args) throws IOException {
        // 1. 빈도수 높으면 앞에 배치
        // 2. 해당 단어의 길이가 길수록 앞에 배치
        // 3. 알파벳 사전순으로
        // 길이 M 이상인 단어만 외움
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            if (temp.length() < m)
                continue;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        
        // 빈도수(value) 기준으로 정렬
        entryList.sort((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o2.getValue() - o1.getValue(); // 빈도수 내림차순
            } else if (o1.getKey().length() != o2.getKey().length()) {
                return o2.getKey().length() - o1.getKey().length(); // 길이 내림차순
            } else {
                return o1.getKey().compareTo(o2.getKey()); // 사전순 오름차순
            }
        });

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : entryList) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.print(sb);

    }
}
