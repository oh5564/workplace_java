package baekjoon.D0408.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface P3052 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 10;
        int size = 42;
        int arr[] = new int[size];
        int sum = 0;
        for(int i=0;i<n;i++){
            int a= Integer.parseInt(br.readLine());
            int temp = a % 42;
            arr[temp]++; // 42로 나눈 나머지의 배열값 ++
        }
        for (int i : arr) {
            if(i!=0) sum++;
        }
        System.out.println(sum);


    }
}
