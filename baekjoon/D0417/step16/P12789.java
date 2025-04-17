package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P12789 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int target = 1;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (target == temp) {
                target++;
            } else {
                stack.push(temp);
            }
            while(!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                target++;
            }
        }

        if(stack.isEmpty()) {
            System.out.println("Nice");
        } else{
            System.out.println("Sad");
        }

    }
}
