package baekjoon.D0417.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for(int i = 0; i<k;i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp!=0){
                stack.push(temp);
            } else{
                stack.pop();
            }
        }
        for (Integer i : stack) {
            sum+=i;
        }
        System.out.println(sum);
    }
}   
