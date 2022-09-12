package boj;

import java.io.*;
import java.util.*;

public class Boj_1316_그룹단어체커 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int tc = 0; tc < N; tc++) {
            boolean[] alphabet = new boolean[26];
            String s = br.readLine() + "!";
            boolean flag = false;

            for (int i = 0; i < s.length()-1; i++) {
                char now = s.charAt(i);
                char next = s.charAt(i+1);

                if(now != next) {
                    if(alphabet[now-'a']) {
                        flag = true;
                        break;
                    }
                    alphabet[now - 'a'] = true;
                }
            }
            if (!flag) answer++;
        }
        System.out.println(answer);
    }
}
