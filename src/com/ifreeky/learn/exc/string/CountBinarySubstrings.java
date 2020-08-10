package com.ifreeky.learn.exc.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 计数二进制子串
 *
 * @author teng.dang
 * @date 2020/8/10
 * @link https://leetcode-cn.com/problems/count-binary-substrings/comments/
 */
public class CountBinarySubstrings {

    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int ptr = 0;
        int n = s.length();
        while (ptr < n) {
            int count = 0;
            char c = s.charAt(ptr);
            while (ptr < n && s.charAt(ptr) == c) {
                ptr ++;
                count ++;
            }
            counts.add(count);
        }
        int total = 0;
        for (int i = 1; i < counts.size(); i++) {
            total = total + Math.min(counts.get(i - 1) , counts.get(i));
        }
        return total;
    }

    public int countBinarySubstringsV2(String s) {
        int slow = 0;
        int preSize = 0;
        int total = 0;
        for (int i = 0; i < s.length();) {
            if (s.charAt(slow) == s.charAt(i)) {
                i++;
            }else {
                if (slow != 0) {
                    total = total + Math.min(preSize, i - slow);
                }
                preSize = i - slow;
                slow = i;
            }
            if (i == s.length()) {
                total = total + Math.min(preSize, i - slow);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        CountBinarySubstrings countBinarySubstrings = new CountBinarySubstrings();
        System.out.println(countBinarySubstrings.countBinarySubstringsV2("10101"));
    }
}
