package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P18528 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            switch (temp) {
                case "push":
                    que.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(que.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    if (que.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(que.peek()).append("\n");
                    }

                    break;
                case "back":
                    if (que.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(((LinkedList<Integer>) que).getLast()).append("\n");
                    }

                    break;
            }
        }
        System.out.println(sb);
    }
}
