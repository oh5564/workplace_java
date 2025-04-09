package baekjoon.D0409.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;
        double avg = 0;
        double sum = 0;
        double sum_credit = 0;
        for (int i = 0; i < n; i++) { // 전공과목, 학점, 등급
            StringTokenizer st = new StringTokenizer(br.readLine());
            String trash = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            int p = 9; // 점수 수
            String temp[] = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }; // 등급
            double score[] = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 }; // 등급에 따른 점수

            if (grade.equals("p")) { // p의 경우 패스
                break;
            } else {
                for (int j = 0; j < p; j++) { // 등급 찾기
                    if (grade.equals(temp[j])) {
                        sum += score[j] * credit;
                        sum_credit += credit;
                    }
                }
            }
        }
        avg = sum / sum_credit;
        System.out.printf("%.6f",avg);
    }
}
