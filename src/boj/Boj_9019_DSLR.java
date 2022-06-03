package boj;

import java.util.*;
import java.io.*;

public class Boj_9019_DSLR {
    static int T;
    static int A, B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            String[] res = new String[10000];
            boolean[] visited = new boolean[10000];
            Queue<Integer> q = new LinkedList<>();
            visited[A] = true;
            q.add(A);
            Arrays.fill(res, "");

            while (!q.isEmpty() && !visited[B]) {
                int num = q.poll();
                int D = (num * 2) % 10000;
                int S = num == 0 ? 9999 : num - 1;
                int L = (num % 1000) * 10 + num / 1000;
                int R = (num % 10) * 1000 + num / 10;

                if (!visited[D]) {
                    q.add(D);
                    visited[D] = true;
                    res[D] = res[num] + "D";
                }
                if (!visited[S]) {
                    q.add(S);
                    visited[S] = true;
                    res[S] = res[num] + "S";
                }
                if (!visited[L]) {
                    q.add(L);
                    visited[L] = true;
                    res[L] = res[num] + "L";
                }
                if (!visited[R]) {
                    q.add(R);
                    visited[R] = true;
                    res[R] = res[num] + "R";
                }
            }
            System.out.println(res[B]);
        }
        System.out.println();

    }

}
