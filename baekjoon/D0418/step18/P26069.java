package baekjoon.D0418.step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P26069 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = "ChongChong";
        StringTokenizer st;
        boolean flag = false;
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();
            if (flag) {
                if (map.containsKey(name1)) {
                    map.put(name2, null);
                } else if (map.containsKey(name2)) {
                    map.put(name1, null);
                }
            }
            if (name1.equals(name) || name2.equals(name)) {
                flag = true;
                map.put(name1, null);
                map.put(name2, null);
            }

        }
        System.out.println(map.size());
    }
}
