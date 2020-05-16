package com.ifreeky.learn.tree.binary.traverse.midorder;

import com.ifreeky.learn.tree.binary.base.Node;

import java.util.Objects;
import java.util.Stack;

/**
 * 二叉树中序遍历
 * @author ifreeky
 * @since 15 五月 2020
 */
public class MiddleOrder {
    public void recursive(Node root) {
        if (null == root){
            return;
        }
        recursive(root.getLeft());
        print(root);
        recursive(root.getRight());
    }

    public void unRecursive(Node root) {
        if (Objects.isNull(root)) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (!stack.isEmpty() || Objects.nonNull(cur)) {
            if (cur != null){
                stack.push(cur);
                cur = cur.getLeft();
            }else {
                Node node = stack.pop();
                print(node);
                cur = node.getRight();
            }
        }
    }

    private void print(Node node) {
        System.out.println(node.getData());
    }
}
