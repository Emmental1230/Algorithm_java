package boj;

import java.io.*;

public class Boj_2668_숫자고르기 {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static boolean isLoop;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        visited = new boolean[N + 1];

        // 자기 자신
        for (int i = 1; i < N+1; i++) {
            if (arr[i] == i)
                visited[i] = true;
        }

        // loop 고려
        for (int i = 1; i < N+1; i++) {
            if (visited[i])
                continue;

            isLoop = false;
            visited[i] = true;
            loop(i,i);
            if (!isLoop)    // loop가 아니면 방문처리 x
                visited[i] = false;
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 1; i < N + 1; i++) {
            if (visited[i]) {
                cnt++;
                sb.append(i).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb);

    }

    static void loop(int i ,int end) {
        int next = arr[i];

        if (!visited[next]) {
            visited[next] = true;
            loop(next, end);

            if (!isLoop)
                visited[next] = false;
        }

        if (next == end)
            isLoop = true;
    }

}
