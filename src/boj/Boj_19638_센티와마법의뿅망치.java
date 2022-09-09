package boj;

import java.io.*;
import java.util.*;

public class Boj_19638_센티와마법의뿅망치 {
    static int N, H, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int cnt = 0;
        while (T > cnt && (pq.peek() >= H && pq.peek() != 1)) {
            pq.offer(pq.poll() / 2);
            cnt++;
        }

        if (pq.peek() >= H) {
            System.out.println("NO");
            System.out.println(pq.peek());
        } else {
            System.out.println("YES");
            System.out.println(cnt);
        }

    }
}
