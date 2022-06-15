package boj;

import java.util.*;
import java.io.*;

public class Boj_2609_최대공약수와최소공배수 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int small = Math.min(N, M);
        int gcd = 1;

        for (int i = 1; i <= small; i++) {
            if (N % i == 0 && M % i == 0) {
                gcd = i;
            }
        }
        int lcm = gcd * (N / gcd) * (M / gcd) ;

        System.out.println(gcd);
        System.out.println(lcm);
    }

}
