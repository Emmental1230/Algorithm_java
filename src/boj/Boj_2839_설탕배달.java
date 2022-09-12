package boj;

import java.io.*;
import java.util.*;

public class Boj_2839_설탕배달 {
    static int N;
    final static int max = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        Arrays.fill(dp, max);

        dp[3] = 1;
        if (N >= 5)
            dp[5] = 1;

        for (int i = 6; i < N + 1; i++)
            dp[i] = Math.min(dp[i - 5], dp[i - 3]) +1;

        if(dp[N] >= max)
            System.out.println(-1);
        else
            System.out.println(dp[N]);
    }

}
