package com.ifreeky.learn.exc.dp;

/**
 * @author ifreeky
 * @link https://leetcode-cn.com/problems/fibonacci-number/
 * @date 2021/1/4
 */
public class Fib {

    public int fib(int n) {
        int first = 0;
        int second = 1;
        int result = 0;
        if (n == 0) {
            return first;
        }
        if (n == 1) {
            return second;
        }

        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
