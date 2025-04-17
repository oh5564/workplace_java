package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        // 1 - x 푸쉬
        // 2 - pop 없으면 -1
        // 3 - 스택의 크기
        // 4 - isempty =1 아니면 0
        // 5 - 맨위의 정수 출력, 없으면 -1
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            switch (k) {
                case 1:
                stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case 2:
                    if(stack.isEmpty()){
                        sb.append("-1 \n");
                    }
                    else{
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3: 
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(stack.isEmpty()) sb.append("1 \n");
                    else sb.append("0 \n");
                    break;
                case 5:
                    if(stack.isEmpty()) sb.append("-1 \n");
                    else
                    sb.append(stack.peek()).append("\n");

                    break;
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
