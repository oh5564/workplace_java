package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P10815 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> arr = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            arr.put(Integer.parseInt(st.nextToken()), 0);
        }
        int m = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<m;i++){
            int p = Integer.parseInt(st.nextToken());
            if(arr.containsKey(p)){
                sb.append("1 ");
            } else{
                sb.append("0 ");
            }
        } 
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
