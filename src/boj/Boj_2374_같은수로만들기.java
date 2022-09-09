package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_2374_같은수로만들기 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> stack = new Stack<>();

        N = Integer.parseInt(br.readLine());
        long maxValue = 0;
        long res = 0;
        for(int i = 0 ; i < N ; i++){
            long x = Long.parseLong(br.readLine());
            maxValue = Math.max(maxValue, x);

            if (stack.isEmpty()) {
                stack.push(x);
            } else {
                if (stack.peek() < x) {
                    res += x - stack.pop();
                    stack.push(x);
                } else if (stack.peek() > x) {
                    stack.pop();
                    stack.add(x);
                }
            }
        }

        while(!stack.isEmpty()){
            long num = stack.pop();
            res += maxValue - num;
        }

        System.out.println(res);
    }
}
