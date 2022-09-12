package boj;

import java.util.*;
import java.io.*;

public class Boj_1976_여행가자 {
    static int N, M;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        // 초기화
        parents = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }

        // 그룹화
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                int tmp = Integer.parseInt(st.nextToken());

                if (tmp == 1)
                    union(i, j);
            }
        }

        // 검사
        st = new StringTokenizer(br.readLine());
        int group = find(Integer.parseInt(st.nextToken()));
        boolean flag = false;

        while (st.hasMoreTokens()) {
            int next = Integer.parseInt(st.nextToken());

            if (group != find(next)) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("NO");
        else
            System.out.println("YES");

    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x < y) {
            parents[y] = x;
        } else {
            parents[x] = y;
        }

    }

    static int find(int x) {
        if (x == parents[x])
            return x;

        return parents[x] = find(parents[x]);
    }
}
