package boj;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Boj_15989_1_2_3더하기4 {
    static int N, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        int[] input = new int[T];
        int[][] dp = new int[10001][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        int maxNum = 0;
        for (int tc = 0; tc < T; tc++) {
            N = Integer.parseInt(br.readLine());
            input[tc] = N;
            maxNum = Math.max(maxNum, N);
        }

        for (int i = 4; i < maxNum+1; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(dp[input[i]][1] + dp[input[i]][2] + dp[input[i]][3]).append("\n");
        }
        System.out.println(sb);
    }
}

