package boj;

import java.io.*;
import java.util.*;

public class Boj_2533_사회망서비스SNS {
    static int N;
//    static boolean[] visited;
    static List<Integer>[] tree;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tree = new LinkedList[N + 1];

        for( int i =1; i <= N; i++){
            tree[i] = new LinkedList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            tree[x].add(y);
            tree[y].add(x);
        }

//        visited = new boolean[N + 1];
        dp = new int[N + 1][2];

        dfs(1, -1);
        System.out.println(Math.min(dp[1][0], dp[1][1]));
    }

    public static void dfs(int cur, int parent) {
//        visited[x] = true;
        dp[cur][1] = 1;

        for (int next : tree[cur]) {
            if (next != parent) {
                dfs(next, cur);
                dp[cur][0] += dp[next][1];
                dp[cur][1] += Math.min(dp[next][0], dp[next][1]);
            }
        }
    }
}
