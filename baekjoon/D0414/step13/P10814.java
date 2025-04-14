package baekjoon.D0414.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10814 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        String[] str = new String[n];
        // 나이순 나이가 같으면 먼저 가입한순서
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            str[i] = st.nextToken();
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            String name = str[i];
            int aux = i - 1;
            while (aux >= 0 && arr[aux] > temp) {
                arr[aux + 1] = arr[aux];
                str[aux+1]= str[aux];
                aux--;
            }
            arr[aux + 1] = temp;
            str[aux+1] = name;
        }
        for(int i=0; i<n;i++){
            sb.append(arr[i]).append(" ").append(str[i]).append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
