package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        // 길이가 짧은것부터
        // 길이가 같으면 사전순으로, 중복 삭제
        List<String> str = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str.add(br.readLine());
        }
        str = str.stream().distinct().collect(Collectors.toList());
        str.sort(null);
        for (int i = 1; i < str.size(); i++) {
            String temp = str.get(i);
            int aux = i - 1;
            while (aux >= 0 && str.get(aux).length() > temp.length()) {
                str.set(aux + 1, str.get(aux));
                aux--;
            }
            str.set(aux+1, temp);
        }
        for (int i = 0; i < str.size(); i++) {
            sb.append(str.get(i)).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
