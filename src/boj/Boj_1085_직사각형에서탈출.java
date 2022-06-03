package boj;

import java.util.*;
import java.io.*;

public class Boj_1085_직사각형에서탈출 {
    static int X, Y, W, H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        int d1 = Math.min(X, W-X);
        int d2 = Math.min(Y, H-Y);
        int res = Math.min(d1, d2);
        System.out.println(res);
    }
}
