package boj;

import java.io.*;
import java.util.*;

public class Boj_2753_윤년 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        if(N % 4 == 0 && N % 100 != 0 || N % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
