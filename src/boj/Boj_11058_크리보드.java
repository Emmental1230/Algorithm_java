package boj;

import java.util.*;

public class Boj_11058_크리보드 {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        long[] dp = new long[N + 1];

        for (int i = 1; i < N + 1; i++) {
            dp[i] = i;

            if (i > 6) {
                for (int j = 0; j < i-3; j++)
                    dp[i] = Math.max(dp[i], dp[i - 3 - j] * (2 + j));
            }
        }
        System.out.println(dp[N]);
    }
    /*
    5
    P P A C V : 4 : dp[n -3] * 2
    P P P P P : 5 : n

    6
    P P P A C V : 6 : dp[n-3 - 0] * 2
    P P A C V V : 6 : dp[n-3-1] * (2+1)

    7
    P P P P A C V : 8 : dp[n-3] * 2
    P P P A C V V : 9 : dp[n-3-1] * (2+1)

    8
    P P P P P A C V : 10 : dp[n-3] * 2
    P P P P A C V V : 12 : dp[n-3-1] * (2+1)
    P P P A C V V V : 12 : dp[n-3-2] * (2+2)

    9
    P P P A C V V V V : 15
    P P P P A C V V V : 16 : dp[n-3-2] * (2+2)

    11
    P P P A C V V V A C V : 24 : dp[n-3] * 2
    P P P A C V V A C V V : 27 : dp[n-3-1] * (2+1)
                            24 : dp[n-3-2] * (2+2)

    12
    30 : dp[12-3] * 2
    P P P P A C V V V A C V : 32 :
    P P P P A C V V A C V V : 36 : dp[12-3-1] * (2+1)
    P P P P A C V A C V V V : 36 : dp[12-3-2] * (2+2)
    */
}