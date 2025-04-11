package baekjoon.D0411.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // x,y - 현위치, w -x 경계 h - y경계
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        // 경계선 4개까지의 최소 거리 구하기 x,y 는 직사각형 내부에만 존재
        int min = Math.min(x, Math.min(y, Math.min(w-x, h-y)));
        System.out.println(min);

    }
}
