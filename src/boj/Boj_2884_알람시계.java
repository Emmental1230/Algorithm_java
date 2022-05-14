package boj;

import java.io.*;
import java.util.*;

public class Boj_2884_알람시계 {
    static int H, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (M < 45) {
            if (H == 0)
                H = 23;
            else
                H -= 1;

            M = 60 + M - 45;
        } else {
            M -= 45;
        }
        System.out.println(H + " "+ M);
    }
}
