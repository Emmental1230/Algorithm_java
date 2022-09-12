package boj;

import java.io.*;
import java.util.*;

public class Boj_10809_알파벳찾기 {
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            if (alphabet[s.charAt(i) - 'a'] == -1)
                alphabet[s.charAt(i) - 'a'] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(" ");
        }
        System.out.println(sb);

    }
}
