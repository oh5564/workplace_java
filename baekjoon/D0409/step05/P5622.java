package baekjoon.D0409.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 1 - 2초 , ABC 3 DEF 4 GHI 5 JKL 6 MNO 7 PQRS 8 TUV 9 WXYZ 10
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A': case 'B': case 'C': sum += 3; break;
                case 'D': case 'E': case 'F': sum += 4; break;
                case 'G': case 'H': case 'I': sum += 5; break;
                case 'J': case 'K': case 'L': sum += 6; break;
                case 'M': case 'N': case 'O': sum += 7; break;
                case 'P': case 'Q': case 'R': case 'S' : sum += 8; break;
                case 'T': case 'U': case 'V': sum += 9; break;
                case 'W': case 'X': case 'Y': case 'Z' : sum += 10; break;

            }
        }
        System.out.println(sum);
    }
}
