package boj;

import java.util.*;
import java.io.*;

public class Boj_2164_카드2 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            if (queue.size() == 1) {
                break;
            }
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());
    }

}
