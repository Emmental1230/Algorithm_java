package boj;

import java.io.*;
import java.util.*;

public class Boj_2798_블랙잭 {
    static int N, M, answer;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        answer = 0;
        comb(0, 0);
        System.out.println(answer);
    }

    static void comb(int depth, int sum) {
        if (depth == 3) {
            if(sum <= M)
                answer = Math.max(answer, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            comb(depth + 1, sum + arr[i]);
            visited[i] = false;
        }
    }

}
