package boj;

import java.io.*;
import java.util.*;

public class Boj_1351_무한수열 {
    static long N;
    static int P, Q;
    static Map<Long, Long> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        System.out.println(dp(N));
    }

    static long dp(long num) {
        if (num == 0)
            return 1;
        if(map.containsKey(num))
            return map.get(num);

        map.put(num, dp(num/P) + dp(num/Q));
        return map.get(num);
    }
}
