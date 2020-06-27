package com.ifreeky.learn.tree.binary.base;

/**
 * 二叉树的节点
 * @author ifreeky
 * @since 15 五月 2020
 */
public class Node implements Comparable<Node> {

    private int data;

    private Node left;

    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node o) {
        return this.data - o.data;
    }
}
