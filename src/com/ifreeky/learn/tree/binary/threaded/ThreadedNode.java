package com.ifreeky.learn.tree.binary.threaded;

/**
 * @author ifreeky
 * @since 06 六月 2020
 */
public class ThreadedNode {

    /**
     * 如果leftType=0,表示指向的是左子树，如果为1，表示指向的是前驱结点
     */
    private int leftType;

    /**
     * 如果rightType=0,表示指向的是右子树，如果为1，表示指向的是后继结点
     */
    private int rightType;

    private int data;

    private ThreadedNode left;

    private ThreadedNode right;


    public ThreadedNode(int data) {
       this.data = data;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ThreadedNode getLeft() {
        return left;
    }

    public void setLeft(ThreadedNode left) {
        this.left = left;
    }

    public ThreadedNode getRight() {
        return right;
    }

    public void setRight(ThreadedNode right) {
        this.right = right;
    }
}
