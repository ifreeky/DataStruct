package com.ifreeky.learn.exc.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode-cn.com/problems/summary-ranges/
 *
 * @author ifreeky
 * @date 2021/1/10
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int startIndex = 0;
        int endIndex = 0;
        int curNum;
        for (int i = 0; i < nums.length; i++) {
            curNum = nums[i];
            if (i + 1 < nums.length && Math.abs(curNum - nums[i+1]) == 1) {
                endIndex = i + 1;
            }else {
                if (startIndex == endIndex) {
                    result.add(String.valueOf(nums[startIndex]));
                }else {
                    result.add(nums[startIndex] + "->" + nums[endIndex]);
                }
                startIndex = i+1;
                endIndex = startIndex;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        System.out.println(summaryRanges.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}
