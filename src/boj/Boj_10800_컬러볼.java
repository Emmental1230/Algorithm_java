package boj;

import java.util.*;
import java.io.*;

public class Boj_10800_컬러볼 {
    static int N;
    static int[][] balls;
    static int[] res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        balls = new int[N][3];
        int[] colors = new int[N+1];
        res = new int[N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int color = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());

            balls[i][0] = color;
            balls[i][1] = size;
            balls[i][2] = i;
        }

        Arrays.sort(balls, (o1, o2) -> o1[1] - o2[1]);

        int sum = 0;
        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = idx; j < i; j++) {
                System.out.println(idx);
                sum += balls[j][1];
                colors[balls[j][0]] += balls[j][1];
                idx++;
            }
            res[balls[i][2]] = sum - colors[balls[i][0]];
        }

        for (int i = 0; i < N; i++) {
            sb.append(res[i]).append("\n");
        }
        System.out.println(sb);
    }
}
