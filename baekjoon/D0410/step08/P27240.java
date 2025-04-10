package baekjoon.D0410.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27240 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int q  = 25, d = 10, n = 5, p = 1;
        int size =4;
        for(int i=0; i<t;i++){
            int arr[] = new int[4];
            int money = Integer.parseInt(br.readLine());
            int k =0;
            while(money>=q){
                money-=q;
                arr[k]++;
            }
            k++;
            while(money>=d){
                money-=d;
                arr[k]++;
            }
            k++;
            while(money>=n){
                money-=n;
                arr[k]++;
            }
            k++;
            while(money>=p){
                money-=p;
                arr[k]++;
            }
            for(int j=0;j<size;j++){
                sb.append(arr[j]).append(" ");
            }
            sb.setLength(sb.length()-1);
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
        
    }
}
