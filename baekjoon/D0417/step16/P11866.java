package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        sb.append("<");
        while (que.size()!=0) {
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    int temp = que.poll();
                    sb.append(temp).append(", ");
                    break;
                } else {
                    int temp = que.poll();
                    que.add(temp);
                }

            }

        }
        sb.setLength(sb.length() - 2);
        sb.append(">");
        System.out.println(sb);
    }
}
