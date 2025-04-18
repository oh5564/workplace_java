package baekjoon.D0418.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P25192 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag = false; // enter 이후 채팅만 확인
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            int old = map.size();
            if (flag && !temp.equals("ENTER")) {
                map.put(temp, null);
                if( map.size()>old){ // enter이후 처음 채팅친 경우
                    count++;
                }
            }
            if (temp.equals("ENTER")) {
                flag = true;
                map.clear();
            }
        }
        System.out.println(count);
    }
}
