package boj;

import java.io.*;
import java.util.*;

public class Boj_2675_문자열반복 {
    static int T, R;
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(S.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);



    }
}
