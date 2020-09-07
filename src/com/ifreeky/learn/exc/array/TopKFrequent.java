package com.ifreeky.learn.exc.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @link https://leetcode-cn.com/problems/top-k-frequent-elements/
 * @author teng.dang
 * @date 2020/9/7
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] tub = new List[nums.length + 1];
        for (Integer key : map.keySet()) {
            int i = map.get(key);
            if (tub[i] == null) {
                tub[i] = new ArrayList<>();
            }
            tub[i].add(key);
        }
        List<Integer> resp = new ArrayList<>();
        for (int i = tub.length - 1; i > 0 && resp.size() < k; i--) {
            if (tub[i] == null) {
                continue;
            }
            resp.addAll(tub[i]);
        }
        return resp.stream().mapToInt(x -> x).toArray();
    }

}
