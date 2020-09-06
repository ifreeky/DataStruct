package com.ifreeky.learn.exc.tree.binary.traverse.postorder;

import com.ifreeky.learn.exc.tree.binary.base.Node;

import java.util.Objects;
import java.util.Stack;

/**
 * @link https://zhuanlan.zhihu.com/p/80578741
 * @author ifreeky
 * @since 15 五月 2020
 */
public class PostOrder {

    public void recursive(Node root) {
        if (null == root) {
            return;
        }
        recursive(root.getLeft());
        recursive(root.getRight());
        print(root);
    }

    public void unRecursive(Node root) {
        if (Objects.isNull(root)) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node per = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.getLeft();
            }

            if (!stack.isEmpty()) {
                cur = stack.pop();
                if (cur.getRight() == null || per == cur.getRight()) {
                      print(cur);
                      per = cur;
                      cur = null;
                } else {
                    stack.push(cur);
                    cur = cur.getRight();
                }

            }
        }

    }

    private void print(Node node) {
        System.out.println(node.getData());
    }
}
