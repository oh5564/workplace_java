package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = 2;
        int arr[] = new int[n]; 
        int rev_arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            while(arr[i]!=0){
                rev_arr[i]=rev_arr[i]*10 + arr[i]%10; 
                arr[i]/=10;
            }
        }
        for (int i : rev_arr) {
            if( i > max) max =i;
        }
        System.out.println(max);

        

    }
}
