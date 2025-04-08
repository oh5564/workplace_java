package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        double max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]= Double.parseDouble(st.nextToken());
            if(arr[i]>max) max=arr[i];
        }
        double temp[] = new double[n]; // 새로운 점수 저장
        double sum = 0 ;
        for(int i=0; i<n;i++){
            temp[i]= (arr[i]/max)*100;
            sum+=temp[i];
        }
        double avg = sum /n ;
        System.out.println(avg);

    }
}
