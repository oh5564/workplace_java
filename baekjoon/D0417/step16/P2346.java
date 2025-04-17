package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P2346 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int start = 1;
        int arr[] = new int[n + 1];
        Deque<Integer> que = new ArrayDeque<>();
        sb.append(start).append(" ");
        for (int i = 1; i <= n; i++) {
            que.add(i);
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }
        que.poll(); // 1 삭제
        int i = 1;
        int count = 0;
        while (!que.isEmpty()) {
            if (arr[i] > 0) { // 오른쪽으로 갈때
                int p = que.poll();
                count++;
                if (count == arr[i]) {
                    sb.append(p).append(" ");
                    i = p;
                    count = 0;
                } else {
                    que.add(p);
                }

            } else {// 왼쪽으로 갈때
                int p = que.pollLast();
                count++;
                if(count==Math.abs(arr[i])){
                    sb.append(p).append(" ");
                    i =p;
                    count=0;
                } else {
                    que.addFirst(p);
                }
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
