package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =br.readLine();
        int n = 8; //알파벳 수
        String arr[] ={"c=", "z=", "s=", "c-","d-","lj","nj","dz="};
        char[] temp = str.toCharArray();
        int count = 0;
        //3글자 먼저 찾기
        for(int i=0;i<temp.length-2;i++){
            if(arr[n-1].equals(""+temp[i]+temp[i+1]+temp[i+2])){
                temp[i] = temp [i+1] = temp [i+2] = ' ';
                count++;
            }
        }
        // 2글자
        for(int i=0;i<temp.length-1;i++){
            for(int j = 0; j<n-1;j++){
                if(arr[j].equals(""+temp[i]+temp[i+1])){
                    temp[i] = temp [i+1] = ' ';
                    count++;
                }
            }
        }
        // 1글자
        for(int i=0; i<temp.length;i++){
            if(temp[i]!=' ') count++;
        }
        System.out.println(count);
    }
}
