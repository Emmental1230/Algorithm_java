package boj;

import java.io.*;
import java.util.*;

public class Boj_10828_스택 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int size = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens())
                num = Integer.parseInt(st.nextToken());

            switch (cmd) {
                case "push":
                    stack[size++] = num;
                    break;
                case "pop":
                    if(size == 0)
                        sb.append(-1).append("\n");
                    else {
                        sb.append(stack[--size]).append("\n");
                        stack[size] = 0;
                    }
                    break;
                case "size":
                    sb.append(size).append("\n");
                    break;
                case "empty":
                    int tmp = size == 0 ? 1 : 0;
                    sb.append(tmp).append("\n");
                    break;
                case "top":
                    if(size == 0)
                        sb.append(-1).append("\n");
                    else
                        sb.append(stack[size - 1]).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
