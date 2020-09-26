package com.ifreeky.learn.exc.tree.binary;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author teng.dang
 * @link https://leetcode-cn.com/problems/path-sum-ii/
 * @date 2020/9/26
 */
public class PathSum {

    List<List<Integer>> result = new LinkedList<>();
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) {
            return result;
        }

        dfs(root, sum);

        return result;

    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        sum -= root.val;
        if (root.right == null && root.left == null && sum == 0) {
            result.add(new LinkedList<>(path));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.pollLast();
    }
}
