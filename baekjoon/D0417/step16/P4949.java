package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        loop: while (true) {
            String temp = br.readLine();
            if (temp.equals(".")) {
                break;
            } else {
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < temp.length(); i++) {
                    char c = temp.charAt(i);
                    if (c == ' ')
                        continue;
                    if (c == '[') {
                        stack.push(c);
                    } else if (c == '(') {
                        stack.push(c);
                    } else if (c == ')') {
                        if (stack.isEmpty()) {
                            sb.append("no\n");
                            continue loop;
                        } else {
                            if (stack.peek() == '(') {
                                stack.pop();
                            } else {
                                sb.append("no\n");
                                continue loop;
                            }

                        }
                    } else if (c == ']') {
                        if (stack.isEmpty()) {
                            sb.append("no\n");
                            continue loop;
                        } else {
                            if (stack.peek() == '[') {
                                stack.pop();
                            } else {
                                sb.append("no\n");
                                continue loop;
                            }

                        }

                    }
                }
                if (stack.isEmpty()) {
                    sb.append("yes\n");
                } else {
                    sb.append("no\n");
                }
            }
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
