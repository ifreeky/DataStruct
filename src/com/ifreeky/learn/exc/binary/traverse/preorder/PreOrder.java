package com.ifreeky.learn.exc.binary.traverse.preorder;

import com.ifreeky.learn.exc.binary.base.Node;

import java.util.Objects;
import java.util.Stack;

/**
 * 二叉树的先序遍历
 * @author ifreeky
 * @since 15 五月 2020
 */
public class PreOrder {

    public void recursive(Node root) {
        if (null == root){
            return;
        }
        print(root);
        recursive(root.getLeft());
        recursive(root.getRight());
    }

    public void unRecursive(Node root) {
        if (Objects.isNull(root)) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node cur = stack.pop();
            print(cur);
            if (Objects.nonNull(cur.getRight())) {
                stack.push(cur.getRight());
            }
            if (Objects.nonNull(cur.getLeft())) {
                stack.push(cur.getLeft());
            }
        }
    }

    private void print(Node node) {
        System.out.println(node.getData());
    }
}
