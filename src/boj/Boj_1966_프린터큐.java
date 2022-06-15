package boj;

import java.util.*;
import java.io.*;

public class Boj_1966_프린터큐 {
    static int T, N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());   // 문서의 개수
            M = Integer.parseInt(st.nextToken());   // 위치
            int cnt = 0;    // 출력 순위

            Queue<int[]> q = new LinkedList<>();  // 중요도 큐
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            while (true) {
                int now[] = q.poll();
                boolean flag = true;

                for (int queue[] : q) {
                    if (queue[1] > now[1]) {    // 현재의 중요도가 낮을 경우
                        flag = false;
                        break;
                    }
                }

                if (flag) { // 현재의 중요도가 가장 높은 경우
                    cnt++;
                    if (now[0] == M) {
                        break;
                    }
                } else {
                    q.offer(now);
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
