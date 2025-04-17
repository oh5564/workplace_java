package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        loop:
        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        sb.append("NO\n");
                        continue loop;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("YES\n");
            }

            else {
                sb.append("NO\n");
            }
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
