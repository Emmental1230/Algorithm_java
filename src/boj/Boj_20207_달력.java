package boj;

import java.io.*;
import java.util.*;

public class Boj_20207_달력 {
    static int N, S, E;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] calendar = new int[366+1];

        // 달력 채우기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            for (int j = S; j <= E; j++) {
                calendar[j]++;
            }
        }

        // 계산
        int x = 0; // 가로
        int y = 0; // 세로
        int res = 0;
        for (int i = 0; i < calendar.length; i++) {
            if (calendar[i] > 0) {
                x++;
                y = Math.max(y, calendar[i]);
            } else {
                res += (x * y);
                x = 0;
                y = 0;
            }
        }
        System.out.println(res);
    }
}
