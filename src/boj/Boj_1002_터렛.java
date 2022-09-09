package boj;

import java.io.*;
import java.util.*;

public class Boj_1002_터렛 {
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append("\n");
            } else if (dist > r1 + r2 || dist < Math.abs(r1 - r2)) {
                sb.append(0).append("\n");
            } else if (dist == r1 + r2 || dist == Math.abs(r1 - r2)) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }
        }
        System.out.println(sb);

    }
}
