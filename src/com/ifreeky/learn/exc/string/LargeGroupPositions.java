package com.ifreeky.learn.exc.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ifreeky
 * @link https://leetcode-cn.com/problems/positions-of-large-groups/
 * @date 2021/1/5
 */
public class LargeGroupPositions {

    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        //@ 记录当前分区字母、开始索引、结束索引、当前区间size
        char curWord = s.charAt(0);
        char positionWord = curWord;
        int startIndex = 0;
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            curWord = s.charAt(i);
            if (curWord == positionWord) {
                size++;
            }
            //@ 如果当前长度大于三，并且当前区间遍历完，记录结果
            else if (size >= 3) {
                List<Integer> position = new ArrayList<>();
                position.add(startIndex);
                position.add(i - 1);
                result.add(position);
                startIndex = i;
                size = 1;
                positionWord = curWord;
            }
            //@ 切换区间，重置分区字母、开始索引、结束索引、当前区间size
            else {
                size = 1;
                startIndex = i;
                positionWord = curWord;
            }

            //@ 特殊处理下尾部的
            if ((i == s.length() - 1) && size>=3) {
                List<Integer> position = new ArrayList<>();
                position.add(startIndex);
                position.add(i);
                result.add(position);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        LargeGroupPositions largeGroupPositions = new LargeGroupPositions();
        System.out.println(largeGroupPositions.largeGroupPositions(s));
    }
}
