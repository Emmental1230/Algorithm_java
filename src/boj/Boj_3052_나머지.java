package boj;

import java.io.*;
import java.util.*;

public class Boj_3052_나머지 {
    static int N;

    public static void main(String[] args) throws IOException {
        Set<Integer> s = new HashSet<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            N = Integer.parseInt(br.readLine());
            s.add(N%42);
        }
        System.out.println(s.size());
    }
}
