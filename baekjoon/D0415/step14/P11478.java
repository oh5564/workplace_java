package baekjoon.D0415.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=1; i<=size;i++){ // 부분문자열 길이
            for(int j=0; j+i<=size;j++){ // 부문문자열 시작위치
                String temp = str.substring(j, j+i);
                map.put(temp,0);
            }
        }
        System.out.println(map.size());
    }
}
