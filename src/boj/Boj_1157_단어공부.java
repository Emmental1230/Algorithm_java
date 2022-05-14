package boj;

import java.io.*;
import java.util.*;

/**
 * 대소문자 변경 : toUpperCase , toLowerCase
 * 대소문자 구분없이 비교 : equalsIgnoreCase
 */

public class Boj_1157_단어공부 {
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        s = s.toUpperCase();

        int[] count = new int[26];
        int maxCount = 0;
        char c = 0;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;

            if (maxCount < count[s.charAt(i) - 'A']) {
                maxCount = count[s.charAt(i) - 'A'];
                c = s.charAt(i);
            } else if (maxCount == count[s.charAt(i) - 'A'])
                c = '?';
        }
        System.out.println(c);
    }
}
