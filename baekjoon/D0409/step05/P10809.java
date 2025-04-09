package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int length = 26;
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            arr[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            int temp = (int)str.charAt(i)-'a';
            if(arr[temp]==-1) arr[temp]=i;
        }
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
