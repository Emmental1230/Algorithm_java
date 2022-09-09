package boj;

import java.io.*;
import java.util.*;

public class Boj_2933_미네랄 {
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();

    static int R, C, N;
    static char[][] map;
    static int[] H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        N = Integer.parseInt(br.readLine());
        H = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            H[i] = R - Integer.parseInt(st.nextToken()) ;
        }

        boolean turn = true;    // t : 왼, f: 오

        for (int i = 0; i < N; i++) {
            int h = H[i];   // 던진 창 높이

            turn = shoot(turn, h);
            check();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < R; i++) {
            sb.append(map[i]).append("\n");
        }
        System.out.println(sb);
    }

    static boolean shoot(boolean turn, int h) {

        if (turn) {
            for (int i = 0; i < C; i++) {
                if (map[h][i] == 'x') {
                    map[h][i] = '.';
                    break;
                }
            }
        } else {
            for (int i = C-1; i >= 0; i--) {
                if (map[h][i] == 'x') {
                    map[h][i] = '.';
                    break;
                }
            }
        }
        return !turn;

    }

    static void check() {
        visited = new boolean[R][C];
        ArrayList<int[]> cluster = new ArrayList<>();


        // 바닥에 이어진 cluster 방문하기
        for (int i = 0; i < C; i++) {
            if(map[R-1][i] == '.' || visited[R-1][i])   continue;

            visited[R-1][i] = true;
            q.offer(new int[]{R - 1, i});

            while (!q.isEmpty()) {
                int[] now = q.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int nr = now[0] + dr[dir];
                    int nc = now[1] + dc[dir];

                    if(nr < 0 || nr >=R || nc < 0 || nc >= C || visited[nr][nc] || map[nr][nc] == '.') continue;

                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        // 떠 있는 놈들 탐색
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && map[i][j] == 'x') {
                    map[i][j] = '.';
                    cluster.add(new int[]{i, j});
                }
            }
        }

        // 없으면 끝
        if(cluster.isEmpty()) return;

        // 내릴 수 있을때까지 내리기
        boolean flag = true;
        while (flag) {
            for (int[] now : cluster) {
                int nr = now[0] + 1;
                int nc = now[1];

                if (nr >= R || map[nr][nc] == 'x') {
                    flag = false;
                    break;
                }
            }
            // 밑이 다 비어있으면
            if (flag) {
                for (int[] now : cluster) {
                    now[0]++;
                }
            }
        }

        for (int[] now : cluster) {
            map[now[0]][now[1]] = 'x';
        }
    }

}





















