package boj;

import java.util.*;
import java.io.*;

public class Boj_4153_직각삼각형 {
    static int a,b,c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            if( a*a + b*b == c*c || a*a == b*b + c*c || a*a + c*c == b*b)
                sb.append("right").append("\n");
            else
                sb.append("wrong").append("\n");
        }
        System.out.println(sb);
    }
}
