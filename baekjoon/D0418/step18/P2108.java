package baekjoon.D0418.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class P2108 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>(); // 수, 빈도수 트리맵은 키값으로 자동 정렬해준다
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
            map.put(a, map.getOrDefault(a, 0) + 1); // 빈도 계산
        }

        // 1. 산술 평균
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        sum= Math.round(sum/list.size());
        sb.append((int)sum).append("\n");

        // 2. 중앙값 출력
        list.sort(null);
        sb.append(list.get(list.size() / 2)).append("\n"); // n은 항상 홀수

        // 3. 최빈값, 여러개 있을경우 두번째로 작은 값을 출력
        int maxFrequency = Collections.max(map.values()); 
        ArrayList<Integer> modeCandidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeCandidates.add(entry.getKey());
            }
        }
        if (modeCandidates.size() > 1) {
            sb.append(modeCandidates.get(1)).append("\n"); // 두 번째로 작은 값
        } else {
            sb.append(modeCandidates.get(0)).append("\n"); // 최빈값
        }

        // 4. N개의 수들 중 최댓값과 최솟값의 차이
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        sb.append(max - min);

        System.out.println(sb);
    }
}
