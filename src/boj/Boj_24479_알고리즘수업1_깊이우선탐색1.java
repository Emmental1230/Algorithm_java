package boj;

import java.util.*;
import java.io.*;

public class Boj_24479_알고리즘수업1_깊이우선탐색1 {
    static int N, M, R;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] res;
    static int idx = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M  = Integer.parseInt(st.nextToken());
        R  = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        visited = new boolean[N+1];
        res = new int[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }
        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(res[i]).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int now){
        res[now] = ++idx;
        visited[now] = true;
        for(int next : list[now]){
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}