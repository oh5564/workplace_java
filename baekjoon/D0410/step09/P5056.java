package baekjoon.D0410.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();
        String [] arr= {"factor","multiple","neither"}; // 첫번째 숫자가 두번째 숫자의 약수 - factor
                                                        // 첫번째 숫자가 두번째 숫자의 배수 - multiple
                                                        // 약수 배수 모두 아님 - neither
        while(true){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            if( a == 0 && b ==0){
                break;
            } else{
                if( b % a ==0){
                    sb.append(arr[0]).append("\n");
                } else if ( a % b == 0){
                    sb.append(arr[1]).append("\n");
                } else{
                    sb.append(arr[2]).append("\n");
                }
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
