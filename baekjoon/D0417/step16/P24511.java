package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P24511 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 0 - 큐, 1 - 스택
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // 자료구조 타입 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값 입력 (역순으로 큐에 삽입)
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) { // 큐인 경우 스택에 저장
                stack.push(a);
            }
        }
        while (!stack.isEmpty()) {
            que.add(stack.pop()); // 스택에서 값을 꺼내 큐에 삽입 (역순 처리)
        }

        // 삽입값 처리
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            que.add(value); // 삽입값을 큐에 추가
            sb.append(que.poll()).append(" "); // 큐에서 값을 꺼내 결과에 추가
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}