package boj;

import java.io.*;
import java.util.*;

/**
 * 배열 비교 방법
 *   - 2차 배열 비교 :Arrays.deepEquals(arr1, arr2)
 *   - 1차 배열 비교 : Arrays.equals(arr1, arr2)
 */

public class Boj_2920_음계 {
    static int[] arr = new int[8];
    static int[] a = {1,2,3,4,5,6,7,8};
    static int[] d = {8,7,6,5,4,3,2,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (Arrays.equals(arr, a)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, d)) {
            System.out.println("descending");
        }else
            System.out.println("mixed");


    }
}
