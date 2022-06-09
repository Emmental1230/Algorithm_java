package boj;

import java.util.*;
import java.io.*;

public class Boj_1181_단어정렬 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();   // 길이 순 정렬
                } else
                    return o1.compareTo(o2);    // 사전 순 정렬
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i - 1])) {
                continue;
            } else {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
