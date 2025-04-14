package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 서로 다른 숫자 갯수, 최솟값을 0으로 다음수 +1..
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        int[] temp = new int[n];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);
        int rank =0;
        for(int v : temp){
            if(!rankMap.containsKey(v)){
                rankMap.put(v, rank);
                rank++;
            }
        }
        for(int key: arr){
            int ranking = rankMap.get(key);
            sb.append(ranking).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);

    }




}
