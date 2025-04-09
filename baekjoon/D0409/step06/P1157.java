package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 // a ~ z 아스키코드 97 ~ 122
 // A ~ Z 아스키 코드 65 ~ 90
public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = 26;
        int arr[] =new int[26];
        int max = Integer.MIN_VALUE;
        int count = 0;
        char result = '?';
        for(int i=0; i<str.length();i++){
            if((int)str.charAt(i) >=(int)'a') //소문자인경우
            {
                arr[(int)str.charAt(i)-'a']++;
            }
            else if ( (int)str.charAt(i) <=(int)'Z') // 대문자인경우
            {
                arr[(int)str.charAt(i)-'A']++;
            }
        }
        for (int i : arr) {
            if( i> max) max =i;
        }
        for(int i = 0 ; i<n; i++){
            if(arr[i]==max){
                count++;
                result = (char) (i+'A');
            }
        }
        if(count>=2){
            result = '?';
        }
        System.out.println(result);
    }
}
