package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<a; i++){
            int temp = Integer.parseInt(st.nextToken());
            map.put(temp, 0);
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<b; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(map.containsKey(temp)){ //이미 잇으면
                map.remove(temp);
            }
            else{
                map.put(temp, 0);
            }
        }
        System.out.println(map.size());
    }
}
