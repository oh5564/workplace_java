package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = 3;
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        for (int i : arr) {
            if (i != max) {
                sum += i;
            }
        }
        if (sum == 0) // 모든변이 같은경우
        {
            System.out.println(arr[0] * 3);
        } else if (arr[0]==arr[1] || arr[0] == arr[2]) { // 0과 1이 같으면 혹은 0과 2가 같으면
            if(max==arr[0]) { // max가 두개면
                System.out.println(arr[0]+arr[1]+arr[2]);
            }
            else {
                System.out.println(sum + sum - 1);
            }
        }
        else if (arr[1]==arr[2]) { // 1과 2이 같으면
            if(max==arr[1]) { // max가 두개면
                System.out.println(arr[0]+arr[1]+arr[2]);
            }
            else {
                System.out.println(sum + sum - 1);
            }
        }
         else {
            if (max >= sum) { // 삼각형이 안되는경우
                System.out.println(sum + sum - 1);
            } else {
                System.out.println(sum + max);
            }
        }

    }
}
