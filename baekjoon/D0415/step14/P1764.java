package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        //듣도 못한 사람수 n
        //보도 못한사람 수 m
        for(int i =0; i<n;i++){
            String name = br.readLine();
            map.put(name, 0);
        }
        for(int i = 0; i<m;i++){
            String name = br.readLine();
            if(map.containsKey(name)){ // 돋보잡 명단
                count++;
                list.add(name);
            }
        }
        sb.append(count).append("\n");
        Collections.sort(list);
        for (String string : list) {
            sb.append(string).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
