package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int length = 26;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            int arr[] = new int[length];
            loop: for (int j = 0; j < temp.length(); j++) {
                if (arr[temp.charAt(j) - 'a'] == 0) // 처음 입력되는 경우
                {
                    arr[temp.charAt(j) - 'a']++;
                } else if (arr[temp.charAt(j - 1) - 'a'] != 0) { // 처음이 아닌데 전에 입력된 경우
                    // 그전에 입력된값과 같은경우 ok
                    if (temp.charAt(j - 1) == temp.charAt(j)) {
                        arr[temp.charAt(j) - 'a']++;
                    } else // 그전에 입력된값과 다른데 처음이 아닌경우
                    {
                        break loop;
                    }
                }
                if (j == temp.length()-1) { // 다 통과한경우
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
