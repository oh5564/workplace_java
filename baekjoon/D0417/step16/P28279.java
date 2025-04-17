package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P28279 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            int x=0;
            switch (temp) {
                case 1:
                    x= Integer.parseInt(st.nextToken());
                    que.addFirst(x);
                    break;
            
                    case 2:
                    x= Integer.parseInt(st.nextToken());
                    que.addLast(x);
                    
                    break;
                    case 3:
                        if(que.isEmpty()){
                            sb.append("-1\n");
                        } else {
                            sb.append(que.poll()).append("\n");
                        }
                    break;
                    case 4:
                    if(que.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(que.pollLast()).append("\n");
                    }
                    break;
                    case 5:
                        sb.append(que.size()).append("\n");
                    break;
                    case 6:
                    if(que.isEmpty()){
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    
                    break;
                    case 7:
                    if(que.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(que.peek()).append("\n");
                    }
                    
                    break;
                    case 8:
                    if(que.isEmpty()){
                        sb.append("-1\n");
                    } else {
                        sb.append(que.peekLast()).append("\n");
                    }
                    
                    break;
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
